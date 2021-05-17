import java.util.Scanner;
public class MenuOthello{
	/**
	 *Cette classe permet d'afficher le menu de sélection à l'ouverture du jeu, il y a donc le mot othello qui est indiquée en haut et 
	 * il y a 4 menus : jouer, options, régles, scores. Elle se base sur un tableau 2D qui affiche le menu
	 */
	private char[][] tabAffichageMenu;
	
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
	 *Cette méthode permet d'afficher l'ensemble du menu principale.
	 */
	public void orientationMenu(){
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Dans quel menu vous voulez vous aller ?");
		int ent = saisieUtilisateur.nextInt();
		if(ent > 4){
			System.out.println("T'as un QI négatif ou quoi?");
			this.affichageMenuPrincipale();
		}else if(ent == 1){
			
		}else if(ent == 2){
			this.menuOption();
		}else if(ent == 3){
			this.menuRegle();
		}else{
			this.menuScore();
		}
	}
	public void menuScore(){
		System.out.println("               TOP 3 des parties les plus rapides  :             ");
		System.out.println();
		System.out.println();
		System.out.println("                 Augusto VS Morgane : 1min 12s                 ");
		System.out.println("                      Victoire de Morgane                 ");
		System.out.println("                 Alexandre VS Morgane : 1min 32s                 ");
		System.out.println("                      Victoire de Morgane                 ");
		System.out.println("                 Augusto VS Morgane : 2min 08s                 ");
		System.out.println("                      Victoire de Augusto                 ");
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Arrête de regarder les scores de boss, tu ne va jamais les battres de toute façon.");
		System.out.println("Si tu veux retourner au menu principal, écrit 1");
		int ent = saisieUtilisateur.nextInt();
		while(ent != 1){
			System.out.println("C'est 1 que tu dois mettre pour revenir au menu principal");
			ent = saisieUtilisateur.nextInt();
		}
		this.affichageMenuPrincipale();
	
	}	
	public void menuOption(){
		System.out.println("En faît, on n'a pas mis d'options dans le jeu, mais on a fait un menu options pour que le programme soit stylé");
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Donc si tu veux retourner au menu principal, écrit 1");
		int ent = saisieUtilisateur.nextInt();
		while(ent != 1){
			System.out.println("C'est 1 que tu dois mettre pour revenir au menu principal");
			ent = saisieUtilisateur.nextInt();
		}
		this.affichageMenuPrincipale();
	
	}
	public void menuRegle(){
		System.out.println("Othello se joue à 2, sur un plateau unicolore de 64 cases (8 sur 8), avec des pions bicolores, noirs d'un côté et blancs de l'autre.");
		System.out.println("Le but du jeu est d'avoir plus de pions de sa couleur que l'adversaire à la fin de la partie,");
		System.out.println("celle-ci s'achevant lorsque aucun des deux joueurs ne peut plus jouer de coup légal, généralement lorsque les 64 cases sont occupées. ");
		System.out.println("Au début de la partie, la position de départ  est simple. On commence par 4 pions, 2 noirs et 2 blancs positionner en carré.");
		System.out.println("Les noirs commencent.");
		System.out.println("Chacun à son tour, les joueurs vont poser un pion de leur couleur sur une case vide, adjacente à un pion adverse. ");
		System.out.println("Chaque pion posé doit obligatoirement encadrer un ou plusieurs pions adverses avec un autre pion de sa couleur, déjà placé.");
		System.out.println("Il retourne alors le ou les pions adverse(s) qu'il vient d'encadrer. Les pions ne sont ni retirés de l'othellier, ni déplacés d'une case à l'autre. ");
		System.out.println("On peut encadrer des pions adverses dans les huit directions et plusieurs pions peuvent être encadrés dans chaque direction.");
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("C'est bon, tu as bien lu les règles ? Si tu veux retourner au menu principal, écrit 1");
		int ent = saisieUtilisateur.nextInt();
		while(ent != 1){
			System.out.println("C'est 1 que tu dois mettre pour revenir au menu principal");
			ent = saisieUtilisateur.nextInt();
		}
		this.affichageMenuPrincipale();
	
	}	
	public void affichageMenuPrincipale(){
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
		this.orientationMenu();
	}
	

}
