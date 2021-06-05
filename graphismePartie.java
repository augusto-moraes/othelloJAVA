public class graphismePartie{
	private char[][] tabAffichageMenu;
	
	public graphismePartie(){
		this.tabAffichageMenu = new char[45][71];
	}
	
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
	public void lettreI(int x, int y){
		char[] lettre = 
			{'_','_','_','_','_','_','_','_','_','_',
			'_','_','_','_','_','_','_','_','_','_',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			' ',' ',' ','|',' ',' ','|',' ',' ',' ',
			'_','_','_','|','_','_','|','_','_','_',
			'_','_','_','_','_','_','_','_','_','_',};
		int i = 0;
		for(int ligne = 0; ligne<10; ligne++){
				for(int col = 0; col< 10;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	public void lettreW(int x, int y){
		char[] lettre = 
			{' ','_','_',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','_','_',' ',
			' ','\\',' ','\\',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',' ','/',' ',
			' ',' ','|',' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|',' ','|',' ',' ',
			' ',' ','\\',' ','\\',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','/',' ','/',' ',' ',
			' ',' ',' ','|',' ','|',' ',' ',' ',' ',' ','/','\\',' ',' ',' ',' ',' ','|',' ','|',' ',' ',' ',
			' ',' ',' ','\\',' ','\\',' ',' ',' ',' ','/',' ',' ','\\',' ',' ',' ',' ','/',' ','/',' ',' ',' ',
			' ',' ',' ',' ','|',' ','|',' ',' ','/',' ','/','\\',' ','\\',' ',' ','|',' ','|',' ',' ',' ',' ',
			' ',' ',' ',' ','\\',' ','\\',' ','/',' ','/',' ',' ','\\',' ','\\',' ','/',' ','/',' ',' ',' ',' ',
			' ',' ',' ',' ',' ','|',' ','/',' ','/',' ',' ',' ',' ','\\',' ','\\',' ','|',' ',' ',' ',' ',' ',
			' ',' ',' ',' ',' ','\\','/','_','/',' ',' ',' ',' ',' ',' ','\\','_','\\','/',' ',' ',' ',' ',' ',};
		int i = 0;
		for(int ligne = 0; ligne<10; ligne++){
				for(int col = 0; col< 24;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	public void lettreN(int x, int y){
		char[] lettre = 
			{' ','_','_','_',' ',' ',' ',' ',' ','_',' ',
			'|',' ','\\',' ','\\',' ',' ',' ','|',' ','|',
			'|',' ','|','|',' ','|',' ',' ','|',' ','|',
			'|',' ','|','\\',' ','\\',' ',' ','|',' ','|',
			'|',' ','|',' ','|',' ','|',' ','|',' ','|',
			'|',' ','|',' ','\\',' ','\\',' ','|',' ','|',
			'|',' ','|',' ',' ','|',' ','|','|',' ','|',
			'|',' ','|',' ',' ','\\',' ','\\','|',' ','|',
			'|',' ','|',' ',' ',' ','|',' ','|',' ','|',
			'|','_','|',' ',' ',' ','\\','_','|','_','|',};
		int i =0;
		for(int ligne = 0; ligne<10; ligne++){
				for(int col = 0; col< 11;col++){
					tabAffichageMenu[x+ligne][y+col]=lettre[i];
					i++;
				}
				System.out.println();
		}
	}
	public boolean affichageGraphismePartie(){
		this.contour();
		this.lettreI(2,29);
		lettreW(2,5);
		lettreN(2,40);
		for(int ligne = 0; ligne<tabAffichageMenu.length; ligne++){
			for(int col = 0; col<tabAffichageMenu[ligne].length;col++){
				System.out.print(tabAffichageMenu[ligne][col]);	
				
			}
			System.out.println();
		}
		return false;
		//return this.orientationMenu();
	}
}
