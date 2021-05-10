public class affichageOthello{
		private int[][] tabPionJeu;
		private char[][] tabAffichageJeu;
		
		public affichageOthello(int[][] tabPionJeu){		
			this.tabPionJeu = tabPionJeu;
			tabAffichageJeu = new char[25][25];
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
		
		
		public void PlacementPion(){
			for(int ligne =0; ligne<tabPionJeu.length; ligne++){
				int[] newCoord = {0,0};
				for(int col = 0; col<tabPionJeu[ligne].length; col++){
					if(tabPionJeu[ligne][col] == 0){
						newCoord = this.convertisseurCoordonnees(ligne,col);
						tabAffichageJeu[newCoord[0]][newCoord[1]] = '*';
						tabAffichageJeu[newCoord[0]+1][newCoord[1]] = '*';
						tabAffichageJeu[newCoord[0]][newCoord[1]+1] = '*';
						tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = '*';
					}
				}
			}
						
		}
		
		public void dessinplateau(){
			for(int ligne = 0; ligne<tabAffichageJeu.length; ligne = ligne + 3){
				for(int col = 0; col<tabAffichageJeu[ligne].length;col++){
					tabAffichageJeu[ligne][col] = '#';
				}
			}
			for(int col = 0; col<tabAffichageJeu[0].length; col = col + 3){
				for(int ligne = 0; ligne<tabAffichageJeu.length;ligne++){
					tabAffichageJeu[ligne][col] = '#';
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
