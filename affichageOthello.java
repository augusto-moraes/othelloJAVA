public class AffichageOthello{
		private int[][] tabPionJeu;
		private char[][] tabAffichageJeu;
		/**
		 *ici, c'est la déclaration du constructeur qui permet d'afficher le jeu sur l'interface textuelle. On entre en paramètre un tableau 2D qui
		 * vient de la classe jeu et dont chaque case représente un type de pion.
		 */
		public AffichageOthello(int[][] tabPionJeu){		
			this.tabPionJeu = tabPionJeu;
			int[] taille = this.convertisseurTaillesTableaux(tabPionJeu.length, tabPionJeu[0].length);
			tabAffichageJeu = new char[taille[0]][taille[1]];
			this.dessinplateau();
		}
		/**
		 *Cette méthode me permet, à partir de la taille du tableu de jeu que je récupère, de définir la taille du tableau qui sert à 
		 * l'affichage. En effet, dans le tableau que je récupère de la classe jeu, une case représente un pion, alors que dans le 
		 * tableau d'affichage, un pion est symbolisé par 4 cases (2*2), et il y a les murs toute autour
		 */
		public int[] convertisseurTaillesTableaux(int ligne, int col){
				int[] res = {0,0};
				res[0] = (ligne*3)+1;
				res[1] = (col*3)+1;
				return res;
		}
		/** Cette méthode permet de convertir les coordonnées du tableau 8*8 en coordonnées du tableau d'affichage 
		 * comme les cases du tableau d'affichage, pour un pion, font 2*2, je considère que la coordonnées du pion est la case en haut à droite
		 * Je commence à 1 car le tableaux commence à 0 et la case 0 correspond au mur (car chaque case est entouré d'un mur) Ce convertisseur me
		 * permet de simplifier la pose des pions dans les cases
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
		/**
		 *Les 5 premières méthodes sont des méthodes qui permettent de changer le tableau d'affichage pour placer un pion noir, blanc,
		 * avec ou sans mur, et aussi de mettre une case vide. Quand on fait l'appelle de cette méthode, on rentre les coordonnées de la case et
		 * elle change les cases du tableau pour remplacer par les caractères que nous avons choisis. A chaque fois, on appelle avant la méthode 
		 * qui converties les coordonnées car les coordonnées que l'on indique lors de la déclaration sont ceux du tableau de jeu et non du tableau
		 * d'affichage
		 */
		 
		 /**
		 *Ici, c'est la méthode qui permet de remplacer une case du tableau par une case vide. On remet aussi les murs à l'origine dans le cas où l'on remplace
		 * une case entouré de mur par une case sans mur. 
		 */
		 
		public void caseVide(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = ' ';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = ' ';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = ' ';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = ' ';
			for(int l = newCoord[0]-1; l<newCoord[0]+2; l++){
				if(tabAffichageJeu[l][newCoord[1]-1] != '#'){
					tabAffichageJeu[l][newCoord[1]-1] = '|';
				}
				if(tabAffichageJeu[l][newCoord[1]+2] != '#'){
					tabAffichageJeu[l][newCoord[1]+2] = '|';
				}
			}
			for(int c = newCoord[1]-1; c<=newCoord[1]+2; c++){
				if(tabAffichageJeu[newCoord[0]-1][c] != '#'){
					tabAffichageJeu[newCoord[0]-1][c] = '-';
				}
				if(tabAffichageJeu[newCoord[0]+2][c] != '#'){
					tabAffichageJeu[newCoord[0]+2][c] = '-';
				}
			}
		
		}
		/**
		 *Ici, c'est la méthode qui permet de remplacer une case du tableau par un pion noir, symboliser par un N.On remet aussi les murs à l'origine dans le cas où l'on remplace
		 * une case entouré de mur par une case sans mur. 
		 */
		public void pionNoir(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'N';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'N';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'N';
			for(int l = newCoord[0]-1; l<newCoord[0]+2; l++){
				if(tabAffichageJeu[l][newCoord[1]-1] != '#'){
					tabAffichageJeu[l][newCoord[1]-1] = '|';
				}
				if(tabAffichageJeu[l][newCoord[1]+2] != '#'){
					tabAffichageJeu[l][newCoord[1]+2] = '|';
				}
			}
			for(int c = newCoord[1]-1; c<=newCoord[1]+2; c++){
				if(tabAffichageJeu[newCoord[0]-1][c] != '#'){
					tabAffichageJeu[newCoord[0]-1][c] = '-';
				}
				if(tabAffichageJeu[newCoord[0]+2][c] != '#'){
					tabAffichageJeu[newCoord[0]+2][c] = '-';
				}
			}
		}
		/**
		 *Ici, c'est la méthode qui permet de remplacer une case du tableau par un pion blanc, symboliser par un B.On remet aussi les murs à l'origine dans le cas où l'on remplace
		 * une case entouré de mur par une case sans mur. 
		 */
		public void pionBlanc(int ligne, int col){
			int[] newCoord = {0,0};
			newCoord = this.convertisseurCoordonnees(ligne,col);
			tabAffichageJeu[newCoord[0]][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]] = 'B';
			tabAffichageJeu[newCoord[0]][newCoord[1]+1] = 'B';
			tabAffichageJeu[newCoord[0]+1][newCoord[1]+1] = 'B';
			for(int l = newCoord[0]-1; l<newCoord[0]+2; l++){
				if(tabAffichageJeu[l][newCoord[1]-1] != '#'){
					tabAffichageJeu[l][newCoord[1]-1] = '|';
				}
				if(tabAffichageJeu[l][newCoord[1]+2] != '#'){
					tabAffichageJeu[l][newCoord[1]+2] = '|';
				}
			}
			for(int c = newCoord[1]-1; c<=newCoord[1]+2; c++){
				if(tabAffichageJeu[newCoord[0]-1][c] != '#'){
					tabAffichageJeu[newCoord[0]-1][c] = '-';
				}
				if(tabAffichageJeu[newCoord[0]+2][c] != '#'){
					tabAffichageJeu[newCoord[0]+2][c] = '-';
				}
			}
		
		}
		/**
		 *Ici, c'est la méthode qui permet de remplacer une case du tableau par un pion noir, symboliser par un N. Mais en plus, c'est une case avec un
		 * mur autour, qui est symboliser par un #
		 */
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
		/**
		 *Ici, c'est la méthode qui permet de remplacer une case du tableau par un pion blanc, symboliser par un B. Mais en plus, c'est une case avec un
		 * mur autour, qui est symboliser par un #
		 */
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
		
		/**
		 *Cette méthode permet de placer dans le tableau d'affichage, le bon type de case. En effet, le tableau fournit par la classe Jeu founit à 
		 * cette classe un tableau d'entier où une case représente un type de pion. Un case 0 signifie quelle est vide, 1 est une case avec un pion noir
		 * 2 est une case avec un pion noir, une case 3 est un pion noir avec un mur autour et une 5 est un pion blanc avec un mur autour
		 * Ainsi pour chaque case du tableau de jeu, cette classe détecte quelle type de pion c'est et va ensuite appeller la méthode qui va placer ce pion
		 * en indiquant les coordonnées.
		 */
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
		/**
		 *Cette méthode est celle qui dessine le plateau de jeu vie de façon textuelle. Ainsi, toute les cases sont vides.
		 */
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
		/**
		 *Cette méthode est celle qui affiche le plateau de jeu de façon textuel. 
		 */
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
