public class testAffichage{
	public static void main(String[] args){
		int[][] tabEssai = {{0,0,0,2,0,1,0,0},{3,0,4,0,0,0,2,0},{0,0,0,1,3,0,0,0},{0,0,2,0,0,0,4,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
		AffichageOthello jeu1 = new AffichageOthello(tabEssai);
		jeu1.affichagePlateau();
		MenuOthello menu1 = new MenuOthello();
		menu1.affichageMenu();
	}
}
