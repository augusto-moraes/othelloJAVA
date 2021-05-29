public class JeuOthello {
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
		this.plateau[(int)(nbrcolonnes/2)][(int)(nbrlignes/2)] = 2 ; 
		this.plateau[(int)((nbrcolonnes/2)+1)][(int)(nbrlignes/2)] = 1 ; 
		this.plateau[(int)(nbrcolonnes/2)][(int)((nbrlignes/2)+1)] = 2 ;
		this.plateau[(int)((nbrcolonnes/2)+1)][(int)((nbrlignes/2)+1)] = 1 ; 
	}

	public void play() {
		boolean gameover = false;

		if(moves % 2 == 0) {
			print.tourBlanc();
			while(!this.poserPion(2));
		} else {
			print.tourNoir();
			while(!this.poserPion(1));
		}
		this.nextTour();
	}

	public void nextTour() {
		moves++;
		print.affichagePlateau();
		this.play();
	}
	
	public boolean poserPion (int Couleurjoueur, int x, int y) { 
		if (plateau[x][y] == 0){  
			plateau[x][y] = Couleurjoueur ; 
			
			int sandwich1 = 0 ;// pour des sandwichs en colonne vers le bas 
			int sandwich2 = 0 ;// pour des sandwichs en colonne vers le haut 
			int sandwich3 = 0 ;// pour des sandwichs en ligne vers la droite
			int sandwich4 = 0 ;// pour des sandwichs en ligne vers la gauche 
			
			// pour des sandwichs vers le bas : 
			if (plateau[x+1][y]!= 0 && Math.abs(plateau[x][y]-plateau[x+1][y]) !=0) { //si la case du dessous est vide et qu'elle est de la couleur adverse
	
				for (int i=1; i<plateau.length -x ; i++) { //
					while (plateau[x+i][y]-plateau[x+1+i][y]==0){ //on cherche combien de pions de la couleur adverse sont alignés à la suite vers le bas
						sandwich1 = sandwich1+1 ; 
				
					}
				}
				if(plateau[x][y]-plateau[x+sandwich1][y]==0){// on s'assure que ces pions alignés sont bien pris en sandwich avec un pion de la couleur initiale au bout de la ligne
					for (int i =1 ; i<= sandwich1 ; i++) { 
						ChangerCouleur(x+i,y) ; // on change la couleur de tous ces pions en question
					}					
				}
				
			} else if (plateau[x-1][y]!= 0 && Math.abs(plateau[x][y]-plateau[x-1][y]) !=0) { // pour des sandwichs vers le haut  
				
				for (int i=1; i<plateau.length -x ; i++) {
					while (plateau[x-i][y]-plateau[x-1-i][y]==0){ 
						sandwich2 = sandwich2+1 ; 
					}
				}
				if(plateau[x][y]-plateau[x-sandwich2][y]==0){
					for (int i=1 ; i<=sandwich2 ; i++) { 
						ChangerCouleur(x-i,y); 
					}
				}
			
			} else if (plateau[x][y+1]!= 0 && Math.abs(plateau[x][y]-plateau[x][y+1]) !=0) {// pour des sandwichs vers la droite
				
				for (int i=1; i<plateau[0].length -y ; i++) {
					while (plateau[x][y+1]-plateau[x][y+1+i]==0){ 
						sandwich3 = sandwich3+1 ; 
				
					}
				}
				if(plateau[x][y]-plateau[x][y+sandwich3]==0){
					for (int i =1 ; i<=sandwich3 ; i++) { 
						ChangerCouleur(x,y+i) ; 
					}					
				}
			} else if (plateau[x][y-1]!= 0 && Math.abs(plateau[x][y]-plateau[x][y-1]) !=0) { // pour des sandwichs vers la gauche
				
				for (int i=1; i<plateau[0].length -y ; i++) {
					while (plateau[x][y-i]-plateau[x][y-1-i]==0){ 
						sandwich4 = sandwich4+1 ; 
					}
				}
				if (plateau[x][y]-plateau[x][y-sandwich4]==0){
					for (int i=1 ; i<=sandwich4 ; i++) { 
						ChangerCouleur(x,y-i); 
					}
				}
			}
			return true;
		} else { 
			System.out.print("Erreur: Impossibilité de poser pion " + Couleurjoueur + " dans la case (" + x + "," + y + ")\nVeuillez essayer une autre case: ");
			return false;
		}
	}

	public boolean poserPion (int joueur) { 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		return this.poserPion(joueur, x, y);
	}

	public void ChangerCouleur (int x, int y) { 
		
		if (plateau[x][y]==1){
			plateau[x][y]=2 ; 
		} else if (plateau[x][y]==2) {
			plateau[x][y]=1 ; 
		}
	}
}
