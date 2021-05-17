public class MenuOthello{
	/**
	 *Cette classe permet d'afficher le menu de sélection à l'ouverture du jeu, il y a donc le mot othello qui est indiquée en haut et 
	 * il y a 4 menus : jouer, options, régles, scores. Elle se base sur un tableau 2D qui affiche le menu
	 */
	char[][] tabAffichageMenu;
	public MenuOthello(){
		this.tabAffichageMenu = new char[40][71];
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage du menu la lettre O du mot othello
	 */
	public void lettreO(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-',
			'|',' ',' ',' ',' ','|',
			'|',' ','-','-',' ','|',
			'|',' ','|','|',' ','|',
			'|',' ','|','|',' ','|',
			'|',' ','|','|',' ','|',
			'|',' ','|','|',' ','|',
			'|',' ','|','|',' ','|',
			'|',' ','-','-',' ','|',
			'|',' ',' ',' ',' ','|',
			'-','-','-','-','-','-'};
		int i = 0;
		for(int ligne = 0; ligne<11; ligne++){
				for(int col = 0; col< 6;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage du menu la lettre T du mot othello
	 */
	public void lettreT(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-',
			'|','-','-','-','-','-','|',
			'-','-','-','-','-','-','-',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','|',' ','|',' ',' ',
			' ',' ','-','-','-',' ',' ',};
		int i = 0;
		for(int ligne = 0; ligne<11; ligne++){
				for(int col = 0; col< 7;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage du menu la lettre E du mot othello
	 */
	public void lettreE(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-',
			'|',' ',' ',' ',' ','|',
			'|',' ','-','-','-','-',
			'|',' ','|',' ',' ',' ',
			'|',' ','-','-','-','-',
			'|',' ',' ',' ',' ','|',
			'|',' ','-','-','-','-',
			'|',' ','|',' ',' ',' ',
			'|',' ','-','-','-','-',
			'|',' ',' ',' ',' ','|',
			'-','-','-','-','-','-'};
		int i = 0;
		for(int ligne = 0; ligne<11; ligne++){
				for(int col = 0; col< 6;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage du menu la lettre L du mot othello
	 */
	public void lettreL(int x, int y){
		char[] lettre = 
			{'-','-','-',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','|',' ',' ',' ',
			'|',' ','-','-','-','-',
			'|',' ',' ',' ',' ','|',
			'-','-','-','-','-','-'};
		int i = 0;
		for(int ligne = 0; ligne<11; ligne++){
				for(int col = 0; col< 6;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage du menu la lettre H du mot othello
	 */
	public void lettreH(int x, int y){
		char[] lettre = 
			{'-','-','-',' ',' ','-','-','-',
			'|',' ','|',' ',' ','|',' ','|',
			'|',' ','|',' ',' ','|',' ','|',
			'|',' ','|',' ',' ','|',' ','|',
			'|',' ','-','-','-','-',' ','|',
			'|',' ',' ',' ',' ',' ',' ','|',
			'|',' ','-','-','-','-',' ','|',
			'|',' ','|',' ',' ','|',' ','|',
			'|',' ','|',' ',' ','|',' ','|',
			'|',' ','|',' ',' ','|',' ','|',
			'-','-','-',' ',' ','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<11; ligne++){
				for(int col = 0; col< 8;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le menu 1.Jouer
	 */
	public void selection1(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ',' ','1','.','J','o','u','e','r',' ',' ',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
				for(int col = 0; col< 15;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le menu 2.Options
	 */
	public void selection2(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ','2','.','O','p','t','i','o','n','s',' ',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 15;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le menu 3.Régle
	 */
	public void selection3(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ',' ','3','.','R','é','g','l','e',' ',' ',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 15;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le menu 4.Score
	 */
	public void selection4(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ',' ','4','.','S','c','o','r','e',' ',' ',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 15;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	/**
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le contour en tiret qui définie l'encadrement du menu
	 */
	public void contour(){
		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			tabAffichageMenu[ligne][0]='|';
			tabAffichageMenu[ligne][tabAffichageMenu[ligne].length-1]='|';
		}
		for(int col = 0; col<tabAffichageMenu[0].length;col++){
			tabAffichageMenu[0][col]='-';
			tabAffichageMenu[tabAffichageMenu.length-1][col]='-';
		}
	}
	/**
	 *Cette méthode permet d'afficher l'ensemble du menu.
	 */
	public void affichageMenu(){
		this.contour();
		this.lettreO(2,9);
		this.lettreT(2,16);
		this.lettreH(2,24);
		this.lettreE(2,33);
		this.lettreL(2,40);
		this.lettreL(2,47);
		this.lettreO(2,54);
		this.selection1(17,28);
		this.selection2(22,28);
		this.selection3(27,28);
		this.selection4(32,28);
		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
				System.out.print(tabAffichageMenu[ligne][col]);
			}
			System.out.println();
		}
	}
	

}
