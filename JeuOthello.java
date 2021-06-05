// 0 = case vide ; 1=noir ; 2 = blanc ; 3 = noir muré ; 4 = blanc muré 
public class JeuOthello {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
    private int nbrlignes ; 
    private int nbrcolonnes ;
    private int [][] plateau;
	private int moves;
	private Joueur joueurNoir;
	private Joueur joueurBlanc;
	private AffichageOthello print;

	public JeuOthello (int nbrlignes, int nbrcolonnes){
		this.nbrlignes= nbrlignes % 2 == 0 ? nbrlignes+1 : nbrlignes;
		this.nbrcolonnes= nbrcolonnes % 2 == 0 ? nbrcolonnes+1 : nbrcolonnes;

		this.joueurNoir = new Joueur(1);
		this.joueurBlanc = new Joueur(2);

		plateau = new int [nbrlignes][nbrcolonnes];
		print = new AffichageOthello(plateau);
		moves = 0;

		System.out.println("Plateau " + nbrlignes + "x" + nbrcolonnes + " cree");
	}

	public JeuOthello (int nbrLB){
		this(nbrLB,nbrLB);
	}

	public void startGame() {
		this.debutPartie();
		print.affichagePlateau();
		this.play();
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

	public void play() {
		boolean gameover = false;

		if(moves % 2 == 0) {
			print.tourNoir();
			while(!this.poserPion(this.joueurNoir));
		} else {
			print.tourBlanc();
			while(!this.poserPion(this.joueurBlanc));
		}
		this.nextTour();
	}

	public void nextTour() {
		moves++;
		print.affichagePlateau();
		this.play();
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
		int [][] dir = {{-1,-1,-1,0,0,1,1,1}, {-1,0,1,-1,1,-1,0,1}};
		for(int i=0;i<dir[0].length;i++){
			for(int j=0;j<dir[1].length;j++) {
				findSandwich(joueur, x, y, dir[0][i], dir[1][j]);
			}
		}
	}

	public boolean isEnemyAround(Joueur joueur, int x, int y) {
		boolean enemyFound = false;
		int [] dir = {-1,0,1};

		int i = 0;
		while(i < dir.length && !enemyFound) {
			if(x + dir[i] >= 0 && x + dir[i] < this.plateau.length) {
				int j = 0;
				while(j < dir.length && !enemyFound) {
					if(y + dir[j] >= 0 && y + dir[j] < this.plateau[0].length) {
						enemyFound = this.plateau[x + dir[i]][y + dir[j]] == joueur.getEnnemi();
					}
					j++;
				}
			}
			i++;
		} 
		return enemyFound;
	}

	public boolean poserPion(Joueur joueur, int x, int y) { 
		boolean res = false;
		if(plateau[x][y] == 0) {
			if(isEnemyAround(joueur, x, y)) {
				plateau[x][y] = joueur.getColor();;
				findSandwich(joueur, x, y);
				res = true;
			} else { 
				System.out.print("Ops! La case (" + (x+1) + "," + (y+1) + ") n'est pas tangente a une piece enemie.\nVeuillez essayer une autre case (joueur "+ joueur.getName() +"): ");
			}
		} else { 
			System.out.print("Ops! La case (" + (x+1) + "," + (y+1) + ") est deja occupee.\nVeuillez essayer une autre case (joueur "+ joueur.getName() +"): ");
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
}
