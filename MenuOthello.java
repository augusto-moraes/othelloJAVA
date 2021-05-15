public class MenuOthello{
	char[][] tabAffichageMenu;
	public MenuOthello(){
		this.tabAffichageMenu = new char[40][70];
	}
	
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
	public void affichageMenu(){
		this.lettreO(2,2);
		this.lettreT(2,9);
		this.lettreH(2,17);
		this.lettreE(2,26);
		this.lettreL(2,33);
		this.lettreL(2,40);
		this.lettreO(2,47);
			for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
				for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
					System.out.print(tabAffichageMenu[ligne][col]);
				}
				System.out.println();
			}
	}
	

}
