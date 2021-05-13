public class affichageOthello{
		private int[][] tabPionJeu;
		private char[][] tabAffichageJeu;
		
		public affichageOthello(int[][] tabPionJeu){		
			this.tabPionJeu = tabPionJeu;
			int[] taille = this.convertisseurTaillesTableaux(tabPionJeu.length, tabPionJeu[0].length);
			tabAffichageJeu = new char[taille[0]][taille[1]];
			this.dessinplateau();
		}
		/** Cette méthode permet de convertir les coordonnées du tableau 8*8 en coordonnées du tableau d'affichage 
		 * comme les cases du tableau d'affichage, pour un pion, font 4*4, je considère que la coordonnées du pion est la case en haut à droite
		 * Je commence à 1 car le tableaux commence à 0 et la case 0 correspond au mur (car chaque case est entouré d'un mur 
		 * 
		 * 
		 * 
		 * 
		 */
		public int[] convertisseurTaillesTableaux(int ligne, int col){
				int[] res = {0,0};
				res[0] = (ligne*3)+1;
				res[1] = (col*3)+1;
				return res;
		}
		public int[] convertisseurCoordonnees(int coorX , int coorY){
			int[] res = {1,1};
			for(int i = 0; i<coorX; i++){
				res[0] = res[0]+3;
			}
			for(int j = 0;j<coorY; j++){
				res[1] = res[1] + 3;
				
			}
			
			return res;
		}
		
		public void caseVide(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'o';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'o';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'o';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'o';
		
		}
		public void pionNoir(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'N';
		
		}
		public void pionBlanc(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'B';
		
		}
		public void pionNoirMur(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'N';
			for(int l = newCoord[0]-1; l<newCoord[0]+2; l++){
				tabAffichageJeu[l][newCoord[1]-1] = '#';
				tabAffichageJeu[l][newCoord[1]+2] = '#';
			}
			for(int c = newCoord[1]-1; c<=newCoord[1]+2; c++){
				tabAffichageJeu[newCoord[0]-1][c] = '#';
				tabAffichageJeu[newCoord[0]+2][c] = '#';
			}
		}
		public void pionBlancMur(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'B';
			for(int l = newCoord[0]-1; l<newCoord[0]+2; l++){
				tabAffichageJeu[l][newCoord[1]-1] = '#';
				tabAffichageJeu[l][newCoord[1]+2] = '#';
			}
			for(int c = newCoord[1]-1; c<=newCoord[1]+2; c++){
				tabAffichageJeu[newCoord[0]-1][c] = '#';
				tabAffichageJeu[newCoord[0]+2][c] = '#';
			}
		}
		public void PlacementPion(){
			for(int ligne =0; ligne<tabPionJeu.length; ligne++){
				for(int col = 0; col<tabPionJeu[ligne].length; col++){
					if(tabPionJeu[ligne][col] == 0){
						this.caseVide(ligne,col);	
					}
					if(tabPionJeu[ligne][col] == 1){
						this.pionNoir(ligne,col);	
					}
					if(tabPionJeu[ligne][col] == 2){
						this.pionBlanc(ligne,col);	
					}
					if(tabPionJeu[ligne][col] == 3){
						this.pionNoirMur(ligne,col);	
					}
					if(tabPionJeu[ligne][col] == 4){
						this.pionBlancMur(ligne,col);	
					}
				}
			}
						
		}
		
		public void dessinplateau(){
			for(int ligne = 0; ligne<tabAffichageJeu.length; ligne = ligne + 3){
				for(int col = 0; col<tabAffichageJeu[ligne].length;col++){
					tabAffichageJeu[ligne][col] = '-';
				}
			}
			for(int col = 0; col<tabAffichageJeu[0].length; col = col + 3){
				for(int ligne = 0; ligne<tabAffichageJeu.length;ligne++){
					tabAffichageJeu[ligne][col] = '|';
				}
			}
		}
		
		public void affichagePlateau(){
			this.PlacementPion();
			for(int ligne = 0; ligne<tabAffichageJeu.length; ligne++){
				for(int col = 0; col<tabAffichageJeu[ligne].length;col++){
					System.out.print(tabAffichageJeu[ligne][col]);
				}
				System.out.println();
			}
		}
				 
}
