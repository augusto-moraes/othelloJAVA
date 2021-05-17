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

		} else {
			print.tourNoir();
		}
	}
	
	public void poserPion (int joueur, int x, int y) { 
		if (plateau[x][y] == 0){ ; 
			plateau[x][y] = joueur ; 
		} else { 
			System.out.println("Erreur: Impossibilité de poser pion " + joueur + " dans la case (" + x + ", " + y + ")");
		}
	}
	
	public void changerCouleur (int x, int y) {
		if (plateau[x][y]==1){
			plateau[x][y]=2 ; 
		} else if (plateau[x][y]==2) {
			plateau[x][y]=1 ; 
		}
	}
}

