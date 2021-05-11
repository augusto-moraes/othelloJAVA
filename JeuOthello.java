public class JeuOthello {
    // Propriétés du tableau (taille)
    private int nbrlignes ; // ne rentrer que des nombres impairs 
    private int nbrcolonnes ;
    private int [][] plateau ; 
    
    
	public JeuOthello (int nbrlignes, int nbrcolonnes){
		this.nbrlignes= nbrlignes ; 
		this.nbrcolonnes= nbrcolonnes ; 
		
		int [][] plateau = new int [nbrlignes][nbrcolonnes] ;
		
	}

	public void DebutPartie() {
		// mettre les quatre pions du milieu 
		// remplir toutes les autres cases par du vide 
		// 0 = case vide ; 1=noir ; 2 = blanc ; 3 = noir muré ; 4 = blanc muré 
		for (int i = 0 ; i < plateau.length ; i++) { //remplissage de toutes les cases en vide
			for (int j=0 ;  j< plateau[0].length ;  j++) {
				plateau[i][j] = 0;
			}
		}
				
		plateau[(int)(nbrcolonnes/2)][(int)(nbrlignes/2)] = 2 ; // situation initale avec les quatres pions *au centre*
		plateau[(int)((nbrcolonnes/2)+1)][(int)(nbrlignes/2)] = 1 ; 
		plateau[(int)(nbrcolonnes/2)][(int)((nbrlignes/2)+1)] = 2 ;
		plateau[(int)((nbrcolonnes/2)+1)][(int)((nbrlignes/2)+1)] = 1 ; 
	
	}
	public void PoserPion (int Couleurjoueur, int x, int y) { 
		if (plateau[x][y] == 0){ ; 
			plateau[x][y] = Couleurjoueur ; 
		} else { 
			System.out.println("erreur"); 
		}
	}
	
	public void ChangerCouleur (int x, int y) {
		if (plateau[x][y]==1){
			plateau[x][y]=2 ; 
		} else if (plateau[x][y]==2) {
			plateau[x][y]=1 ; 
		}
	}

}

