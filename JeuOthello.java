public class JeuOthello {
    // Propriétés du tableau (taille)
    private int nbrlignes ; 
    private int nbrcolonnes ;
    private int [][] plateau ; 
    
    public JeuOthello (int nbrLB){
		this.nbrlignes = nbrLB % 2 ? nbrLB + 1 : nbrLB; 
		this.nbrcolonnes= nbrLB % 2 ? nbrLB + 1 : nbrLB; 
		
		int [][] plateau = new int [nbrLB][nbrLB] ;
	}

	public JeuOthello (int nbrlignes, int nbrcolonnes){
		this.nbrlignes= nbrlignes % 2 ? nbrlignes + 1 : nbrlignes;
		this.nbrcolonnes= nbrcolonnes % 2 ? nbrcolonnes + 1 : nbrcolonnes;
		
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
	/*Principe de la méthode : si quand on pose un pion à un endroit, des pions de la couleur adverse 
	 * sont pris "en sandwish" entre ce pions et un de la même couleur 
	 * alors = changer la couleur de ces pions pris en sandwich.
	 */
	public void poserPion (int Couleurjoueur, int x, int y) { 
		if (plateau[x][y] == 0){ ; 
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
			} else if (plateau[x][y-1]!= 0 && Math.abs(plateau[x][y]-plateau[x][y-1]) !=0) {// pour des sandwichs vers la gauche
				
				for (int i=1; i<plateau[0].length -y ; i++) {
					while (plateau[x][y-i]-plateau[x][y-1-i]==0){ 
						sandwich4 = sandwich4+1 ; 
					}
				}
				if(plateau[x][y]-plateau[x][y-sandwich4]==0){
					for (int i=1 ; i<=sandwich4 ; i++) { 
						ChangerCouleur(x,y-i); 
					}
				}
			}
			
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




