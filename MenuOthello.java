import java.util.Scanner;
public class MenuOthello{
	/**
	 *Cette classe permet d'afficher le menu de sélection à l'ouverture du jeu, il y a donc le mot othello qui est indiquée en haut et 
	 * il y a 4 menus : jouer, options, régles, scores. Elle se base sur un tableau 2D qui affiche le menu
	 */
	private char[][] tabAffichageMenu;
	private JeuOthello jeu;
	private int tailleJeu;
	
	public MenuOthello(){
		this.tabAffichageMenu = new char[45][71];
		tailleJeu = 8;
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
			'|',' ',' ','3','.','R','e','g','l','e','s',' ',' ',' ','|',
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
	 *Cette méthode permet d'inscrire dans le tableau d'affichage le menu Exit
	 */
	public void selection5(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ','5','.','S','o','r','t','i','r',' ',' ',' ','|',
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
	public void selectionTailleTableau(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ',' ','1','.','C','h','a','n','g','e','r',' ','T','a','i','l','l','e',' ',' ',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	public void selectionRetourOptions(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ','2','.','R','e','t','o','u','r','n','e','r',' ','a','u',' ','m','e','n','u',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	public void titreOptions(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ','1','.',' ','P','l','a','y','e','r',' ','V','S',' ','P','l','a','y','e','r',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	public void selectionPlayerVSPlayer(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ','1','.',' ','P','l','a','y','e','r',' ','V','S',' ','P','l','a','y','e','r',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	public void selectionPlayerVSMachine(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ','2','.','P','l','a','y','e','r',' ','V','S',' ','M','a','c','h','i','n','e',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
				tabAffichageMenu[x+ligne][y+col]=lettre[i];
				i++;
			}
			System.out.println();
		}
			
	}
	public void selectionRetour(int x, int y){
		char[] lettre = 
			{'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',
			'|',' ','3','.','R','e','t','o','u','r','n','e','r',' ','a','u',' ','m','e','n','u',' ','|',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
		int i = 0;
		for(int ligne = 0; ligne<3; ligne++){
			for(int col = 0; col< 23;col++){
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
	 *Cette méthode permet d'afficher l'ensemble du menu principale et de circuler entre les différents menues
	 * en sélectionnant le numéro qui correspond
	 */
	public boolean orientationMenu(){
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Choisissez une option:");
		int ent = saisieUtilisateur.nextInt();
		if(ent == 1){
			this.affichageMenuSelectionMode();
		}else if(ent == 2){
			this.menuOption();
		}else if(ent == 3){
			this.menuRegle();
		}else if(ent == 4){
			this.menuScore();
		}else if(ent == 5){
			System.out.println("Tu peux donc fermer la fenêtre");
		}else{
			System.out.println("Mais, tu sais lire ?");
			this.orientationMenu();
		}
		return ent<4;
	}
	public boolean orientationModeJeu(){
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Quel mode de jeu veux-tu essayer ?");
		int ent = saisieUtilisateur.nextInt();
		if(ent == 1 || ent == 2){
			this.jeu = new JeuOthello(tailleJeu);
			this.jeu.startGame(ent);
		}else if(ent == 3){
			this.affichageMenuPrincipale();
		}else{
			System.out.println("Mais, tu sais lire ?");
			this.orientationModeJeu();
		}
		return ent<4;
	}
	public boolean orientationOptions(){
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Quelle option choisit-tu ? ?");
		int ent = saisieUtilisateur.nextInt();
		if(ent == 1){
			setTailleTableau();
		}else if(ent == 2){
			this.affichageMenuPrincipale();
		}else{
			System.out.println("Mais, tu sais lire ?");
			this.orientationOptions();
		}
		return ent<3;
	}
	public void setTailleTableau(){
		int taille = 3;
		while(taille%2 !=0){
			Scanner saisieUtilisateur = new Scanner(System.in);
			System.out.println("Quelle taille de plateau veut-tu ? Il faut mettre un nombre pair ");
			taille= saisieUtilisateur.nextInt();
		}
		tailleJeu = taille;
		this.affichageMenuPrincipale();
		
	}
	/**
	 *Cette méthode permet d'afficher le menu score. Ici est affiché les 3 parties les plus rapides qui ne seront pas actualisés 
	 * car on peut pas faire plus rapide
	 */
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
		System.out.println("");
		System.out.println("");
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
	/**
	 *Cette méthode permet d'afficher le menu options qui est juste là pour que se soit mieux
	 */
	public void menuOption(){
		tabAffichageMenu = new char[40][50];
		this.contour();
		this.selectionTailleTableau(20,13);
		this.selectionRetourOptions(30,13);

		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
				System.out.print(tabAffichageMenu[ligne][col]);	
				
			}
			System.out.println();
		}
		this.orientationOptions();
	}
	/**
	 *Cette méthode permet d'afficher les règles du jeu pour que le joueur puisse jouer dans les meilleurs conditions
	 */
	public void menuRegle(){
		System.out.println("Othello est un jeu de plateau se jouant à 2, traditionnellement sur un othellier unicolore de 64 cases (8 sur ");
		System.out.println("8), avec des pions bicolores, noirs d'un côté et blancs de l'autre. ");
		System.out.println("");
		System.out.println("Avec notre Othello Java Edition, vous pouvez naviguer entre les différents menus en sélectionnant le  ");
		System.out.println("chiffre indiqué devant le menu avec votre clavier et appuyer sur entrée. Dans le menu principal, vous ");
		System.out.println("pouvez directement commencer une partie, ou alors vous pouvez changer la taille du tableau dans le menu ");
		System.out.println("options. Si vous voyez ceci, c’est que je n’ai pas besoin de vous présenter le menu des règles. Le menu 4 est ");
		System.out.println("un menu des scores et le menu 5 permet de quitter le jeu. ");
		System.out.println("");
		System.out.println("Dans notre merveilleux jeu, on peut choisir le nombre de case que va faire votre othellier, afin de moduler");
		System.out.println("votre plaisir de jeu et la durée de la partie selon vos envies. Pour changer la taille du menu, il faut aller ");
		System.out.println("dans Options puis Taille du jeu.");
		System.out.println("");
		System.out.println("Le but du jeu est d'avoir plus de pions de sa couleur que l'adversaire à la fin de la partie, celle-ci s'achevant ");
		System.out.println("lorsque aucun des deux joueurs ne peut plus jouer de coup légal, généralement lorsque toutes les cases ");
		System.out.println("sont occupées, ou alors que aucun retournement et possible.");
		System.out.println("");
		System.out.println("A son tour de jeu, le joueur doit poser un pion de sa couleur. Trois conditions sont nécessaires :");
		System.out.println("1. Le pion doit être posé sur une case vide.");
		System.out.println("2. La case doit être adjacente à un pion adverse ");
		System.out.println("3. Retourner obligatoirement un pion en prenant en Sandwich : Le pion posé doit encadrer un (ou ");
		System.out.println("plusieurs) pions adverses entre le pion qu’il pose et un pion de sa couleur, déjà placé sur l’othellier.");
		System.out.println("Les pions ne sont ni retirés de l’othellier, ni déplacés d’une case à l’autre.");
		System.out.println("Jamais de réactions en chaîne : Les pions retournés ne peuvent pas servir à en retourner d’autres lors du ");
		System.out.println("même tour de jeu.");
		System.out.println("");
		System.out.println("Une des particularités de notre Othello Java Edition, est qu’au cours de la partie, une bombe nucléaire ou ");
		System.out.println("nuke peut apparaître. Lorsque qu’elle arrive, certaines cases vont être protégées par des murs, de façon ");
		System.out.println("aléatoire, et ainsi ne pas être détruites. Celles qui ne sont pas protégées vont passer à la trappe. Ensuite, ");
		System.out.println("vous pourrez continuer votre partie mais avec des pions en moins.");
		System.out.println("");
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("C'est bon, tu as bien lu les règles ? Si tu veux retourner au menu principal, écrit 1");
		int ent = saisieUtilisateur.nextInt();
		while(ent != 1){
			System.out.println("C'est 1 que tu dois mettre pour revenir au menu principal");
			ent = saisieUtilisateur.nextInt();
		}
		this.affichageMenuPrincipale();
	
	}
	/**
	 *Cette méthode permet d'afficher le menu principale avec écrit en haut "OTHELLO" et les différents menus
	 */	
	public boolean affichageMenuPrincipale(){
		tabAffichageMenu = new char[45][71];
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
		this.selection5(37,28);
		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
				System.out.print(tabAffichageMenu[ligne][col]);	
				
			}
			System.out.println();
		}
		return this.orientationMenu();
	}
	public boolean affichageMenuSelectionMode(){
		tabAffichageMenu = new char[40][50];
		this.contour();
		selectionPlayerVSMachine(20,13);
		selectionPlayerVSPlayer(10,13);
		selectionRetour(30,13);
		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
				System.out.print(tabAffichageMenu[ligne][col]);	
				
			}
			System.out.println();
		}
		return this.orientationModeJeu();
	}
	

}
