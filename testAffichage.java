public class testAffichage{
	public static void main(String[] args){
		int[][] tabEssai = {{0,0,0,2,0,1,0,0},{3,0,4,0,0,0,2,0},{0,0,0,1,3,0,0,0},{0,0,2,0,0,0,4,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
		affichageOthello jeu1 = new affichageOthello(tabEssai);
		jeu1.affichagePlateau();
	}
}
