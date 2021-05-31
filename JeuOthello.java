public class JeuOthello {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
    // Propriétés du tableau (taille)
    private int nbrlignes ; 
    private int nbrcolonnes ;
    private int [][] plateau;
	private int moves;
	private AffichageOthello print;

	public JeuOthello (int nbrlignes, int nbrcolonnes){
		this.nbrlignes= nbrlignes % 2 == 0 ? nbrlignes+1 : nbrlignes;
		this.nbrcolonnes= nbrcolonnes % 2 == 0 ? nbrcolonnes+1 : nbrcolonnes;

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
		// mettre les quatre pions du milieu 
		// remplir toutes les autres cases par du vide 
		// 0 = case vide ; 1=noir ; 2 = blanc ; 3 = noir muré ; 4 = blanc muré 

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
			while(!this.poserPion(1));
		} else {
			print.tourBlanc();
			while(!this.poserPion(2));
		}
		this.nextTour();
	}

	public void nextTour() {
		moves++;
		print.affichagePlateau();
		this.play();
	}

	// cherche un sandwich dans la direction dirX dirY
	public void findSandwich(int joueur, int posX, int posY, int dirX, int dirY) {
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
			if(plateau[posX + i*dirX][posY + i*dirY] == joueur) {
				sandwich = true;
			}
			i++;
		}

		if(sandwich) {
			for(int k=0; k<i-1; k++) {
				this.plateau[tmpX[k]][tmpY[k]] = joueur;
			}
		}
	}

	public boolean ennemiVoisin(int joueur) {
		return false;
	}

	public boolean poserPion (int joueur, int x, int y) { 
		if (plateau[x][y] == 0){  
			plateau[x][y] = joueur; 
			
			findSandwich(joueur, x, y, 1, 0);
			findSandwich(joueur, x, y, -1, 0);
			findSandwich(joueur, x, y, 0, 1);
			findSandwich(joueur, x, y, 0, -1);

			// diagonales
			findSandwich(joueur, x, y, 1, 1);
			findSandwich(joueur, x, y, 1, -1);
			findSandwich(joueur, x, y, -1, 1);
			findSandwich(joueur, x, y, -1, -1);

			return true;
		} else { 
			System.out.print("Erreur: Impossibilité de poser pion " + joueur + " dans la case (" + x+1 + "," + y+1 + ")\nVeuillez essayer une autre case: ");
			return false;
		}
	}

	public boolean poserPion (int joueur) {
		int x = scanner.nextInt() - 1;
		int y = scanner.nextInt() - 1;

		while(x > this.plateau.length || x<0 || y > this.plateau[0].length || y<0) {
			System.out.println("Position hors du plateau, veuillez choisir une autre position: ");
			x = scanner.nextInt() - 1;
			y = scanner.nextInt() - 1;
		}

		return this.poserPion(joueur, x, y);
	}

	public void changerCouleur (int x, int y) { 
		
		if (plateau[x][y]==1){
			plateau[x][y]=2 ; 
		} else if (plateau[x][y]==2) {
			plateau[x][y]=1 ; 
		}
	}
}
