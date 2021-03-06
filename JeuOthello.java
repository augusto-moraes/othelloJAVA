// 0 = case vide ; 1=noir ; 2 = blanc ; 3 = noir muré ; 4 = blanc muré 
public class JeuOthello {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
    private int nbrlignes ; 
    private int nbrcolonnes ;
    private int [][] plateau;
	private Joueur joueurNoir;
	private Joueur joueurBlanc;
	private AffichageOthello print;
	private GraphismePartie partie;
	private int moves;

	public JeuOthello (int nbrlignes, int nbrcolonnes){
		this.nbrlignes= nbrlignes % 2 == 0 ? nbrlignes+1 : nbrlignes;
		this.nbrcolonnes= nbrcolonnes % 2 == 0 ? nbrcolonnes+1 : nbrcolonnes;

		this.joueurNoir = new Joueur(1);
		this.joueurBlanc = new Joueur(2);
		this.moves = 0;

		plateau = new int [nbrlignes][nbrcolonnes];
		print = new AffichageOthello(plateau);
		partie = new GraphismePartie();

		System.out.println("Plateau " + nbrlignes + "x" + nbrcolonnes + " cree");
	}

	public JeuOthello(int nbLC){
		this(nbLC,nbLC);
	}

	// gamemode 1 -> pvp / gamemode 2 -> pvIA
	public void startGame(int gamemode) {
		this.debutPartie();
		print.affichagePlateau();
		if(gamemode == 1) {
			this.play(this.joueurNoir, gamemode);
		} else {
			if(gamemode != 2) {
				System.out.println("Gamemode error. Mode player vs machine selected by default.");
			} this.play(this.joueurNoir, 2);
		}
	}

	public void debutPartie() {
		//remplissage de toutes les cases en vide
		for (int i = 0 ; i < this.plateau.length ; i++) { 
			for (int j=0 ;  j < this.plateau[0].length ;  j++) {
				this.plateau[i][j] = 0;
			}
		}
				
		// situation initale avec les quatres pions *au centre*
		this.plateau[(int)(nbrcolonnes/2)][(int)(nbrlignes/2)] = 1; 
		this.plateau[(int)((nbrcolonnes/2)-1)][(int)(nbrlignes/2)] = 2; 
		this.plateau[(int)(nbrcolonnes/2)][(int)((nbrlignes/2)-1)] = 2;
		this.plateau[(int)((nbrcolonnes/2)-1)][(int)((nbrlignes/2)-1)] = 1; 
	}

	public void play(Joueur joueur, int gamemode) {
		if(Math.random()>0.95 && this.moves > this.plateau.length/6){
			nukeDestruction(); 
		} 
		
		if(this.isGameOver(joueur.getEnnemi())){
			this.gameOver(joueur.getEnnemi());
		}else if(!this.isGameOver(joueur)) {
			print.tourJoueur(joueur);
			while(!this.poserPion(joueur));
			this.nextTour(joueur, gamemode);
		} else {
			this.gameOver(joueur);
		}
		this.moves++;
	}

	public boolean poserPion(Joueur joueur, int x, int y) { 
		boolean res = false;
		if(plateau[x][y] == 0) {
			if(isMovePossible(joueur, x, y)) {
				plateau[x][y] = joueur.getColor();;
				findSandwich(joueur, x, y);
				res = true;
			} else { 
				System.out.print("Oups! La case (" + (x+1) + "," + (y+1) + ") n'est pas tangente a une piece enemie.\nVeuillez essayer une autre case (joueur "+ joueur.getName() +"): ");
			}
		} else { 
			System.out.print("Oups! La case (" + (x+1) + "," + (y+1) + ") est deja occupee.\nVeuillez essayer une autre case (joueur "+ joueur.getName() +"): ");
		}
		return res;
	}

	public boolean poserPion(Joueur joueur) {
		int x = scanner.nextInt() - 1;
		int y = scanner.nextInt() - 1;

		while(x > this.plateau.length-1 || x<0 || y > this.plateau[0].length-1 || y<0) {
			System.out.println("Position hors du plateau, veuillez choisir une autre position: ");
			x = scanner.nextInt() - 1;
			y = scanner.nextInt() - 1;
		}

		return this.poserPion(joueur, x, y);
	}

	public void nextTour(Joueur joueur, int gamemode) {
		print.affichagePlateau();
		if(gamemode == 1) { // Tour du prochain joueur
			this.play(joueur.getEnnemi(), gamemode);
		} else { // Machine joue et ensuite tour du joueur
			Joueur machine = joueur.getEnnemi();
			int [][] moves = this.listPossibleMoves(machine);
			int indice = (int) (Math.random()*moves.length);
			this.poserPion(machine, moves[indice][0], moves[indice][1]);

			System.out.println("La machine est en train de penser...");
			this.wait(1000);

			print.affichagePlateau();
			System.out.println("Piece " + machine.getName() + " posée sur la case ("+ (moves[indice][0]+1) +","+ (moves[indice][1]+1) +")");

			this.play(joueur, gamemode);
		}
	}

	public int [][] listPossibleMoves(Joueur joueur) {
		int [][] list = {};

		for(int i=0; i<this.plateau.length; i++) {
			for(int j=0; j<this.plateau[0].length; j++) {
				if(this.plateau[i][j] == 0 && this.isMovePossible(joueur, i, j)) {
					int [][] tmp = new int[list.length+1][2];
					for(int k=0;k<list.length;k++) {
						tmp[k][0] = list[k][0];
						tmp[k][1] = list[k][1];
					}
					list = tmp;
					list[list.length-1][0] = i;
					list[list.length-1][1] = j;
				}
			}
		}

		return list;
	}

	public boolean isGameOver(Joueur joueur) {
		return (this.listPossibleMoves(joueur).length == 0 || this.caseMemeJoueur(joueur) || plateauRemplie(joueur));
	}

	public void gameOver(Joueur joueur) {
		Joueur winner =  joueur.getEnnemi();
		this.wait(1500);
		partie.affichageGraphismeFinPartie(winner.getColor());
		System.out.println("Game Over!\nPlayer " + winner.getName() + " won!");
	}

	// cherche un sandwich dans la direction dirX dirY
	public void findSandwich(Joueur joueur, int posX, int posY, int dirX, int dirY) {
		boolean sandwich = false;
		int [] tmpX = new int [this.plateau.length];
		int [] tmpY = new int [this.plateau[0].length];
		
		int i = 1;
		while(
			posX + i*dirX >= 0 && posX + i*dirX < this.plateau.length && 
			posY + i*dirY >= 0 && posY + i*dirY < this.plateau[0].length &&
			this.plateau[posX+i*dirX][posY+i*dirY] != 0 &&
			!sandwich
		) {
			tmpX[i-1] = posX + i*dirX;
			tmpY[i-1] = posY + i*dirY;
			if(plateau[posX + i*dirX][posY + i*dirY] == joueur.getColor()) {
				sandwich = true;
			}
			i++;
		}

		if(sandwich) {
			for(int k=0; k<i-1; k++) {
				this.plateau[tmpX[k]][tmpY[k]] = joueur.getColor();;
			}
		}
	}

	// Find sandwichs in all directions if there is no given direction
	public void findSandwich(Joueur joueur, int x, int y) {
		int [] dir = {-1,0,1};
		for(int i=0;i<dir.length;i++){
			for(int j=0;j<dir.length;j++) {
				findSandwich(joueur, x, y, dir[i], dir[j]);
			}
		}
	}

	// Verifie si je peux poser le pion dans la case (x,y)
	public boolean isMovePossible(Joueur joueur, int x, int y) {
		boolean movePossible = false;
		int [] dir = {-1,0,1};

		int i = 0;
		while(i < dir.length && !movePossible) {
			if(x + dir[i] >= 0 && x + dir[i] < this.plateau.length) {
				int j = 0;
				while(j < dir.length && !movePossible) {
					if(y + dir[j] >= 0 && y + dir[j] < this.plateau[0].length) {
						int k = 1;
						while(
							x + (k+1)*dir[i] >= 0 && x + (k+1)*dir[i] < this.plateau.length &&
							y + (k+1)*dir[j] >= 0 && y + (k+1)*dir[j] < this.plateau[0].length &&
							this.plateau[x+k*dir[i]][y+k*dir[j]] == joueur.getEnnemi().getColor() &&
							!movePossible
						){
							movePossible = this.plateau[x+(k+1)*dir[i]][y+(k+1)*dir[j]] == joueur.getColor();
							k++;
						}
					}
					j++;
				}
			}
			i++;
		} 
		return movePossible;
	}

	public void nukeDestruction(){
		
		for(int ligne = 0; ligne<plateau.length; ligne++){
			for(int col = 0; col<plateau[ligne].length;col++){
				if(Math.random()<0.1){
					if(plateau[ligne][col]==1){
						plateau[ligne][col]=3;
					}if(plateau[ligne][col]==2){
						plateau[ligne][col]=4;
					}
				}
			}
		}
		partie.affichageGraphismeNuke();
		wait(1500);
		print.affichagePlateauNuke();

		wait(1500);
		for(int ligne = 0; ligne<plateau.length; ligne++){
			for(int col = 0; col<plateau[ligne].length;col++){
				if(plateau[ligne][col]==1){
					plateau[ligne][col]=0;
				}if(plateau[ligne][col]==2){
					plateau[ligne][col]=0;
				}
			}
		}
		print.affichagePlateau();
		wait(1500);
		
		for(int ligne = 0; ligne<plateau.length; ligne++){
			for(int col = 0; col<plateau[ligne].length;col++){
				if(plateau[ligne][col]==3){
					plateau[ligne][col]=1;
				}if(plateau[ligne][col]==4){
					plateau[ligne][col]=2;
				}
			}
		}
		print.affichagePlateau();
		wait(1500);	
	}

	public void wait(int ms){ 
		try {
			Thread.sleep(ms);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public boolean caseMemeJoueur(Joueur joueur){
		boolean rep = false;
		int nb1 = 0;
		int nb2 = 0;
		for(int ligne = 0; ligne<plateau.length; ligne++){
			for(int col = 0; col<plateau[ligne].length;col++){
				if(plateau[ligne][col]==1){
					nb1++;
				}if(plateau[ligne][col]==2){
					nb2++;
				}
			}
		}
		if(joueur.getColor() == 1 && nb1 ==0){
			rep = true;
		}if(joueur.getColor() == 2 && nb2 ==0){
			rep = true;
		}
		return rep;

	}
	public boolean plateauRemplie(Joueur joueur){
		boolean rep = false;
		int nb1 = 0;
		int nb2 = 0;
		for(int ligne = 0; ligne<plateau.length; ligne++){
			for(int col = 0; col<plateau[ligne].length;col++){
				if(plateau[ligne][col]==1){
					nb1++;
				}if(plateau[ligne][col]==2){
					nb2++;
				}
			}
		}
		int nbTotal = nb1 + nb2;
		if(nbTotal == plateau.length * plateau[0].length){
			if(joueur.getColor() ==1 && nb1>nb2){
				rep = true;
			}if(joueur.getColor() ==2 && nb1<nb2){
				rep = true;
			}
		}
		return rep;
	}			
			
}
