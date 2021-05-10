public class testAffichage{
	public static void main(String[] args){
		int[][] tabEssai = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
		affichageOthello jeu1 = new affichageOthello(tabEssai);
		jeu1.affichagePlateau();
	}
}
