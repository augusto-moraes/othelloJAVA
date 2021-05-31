public class Joueur {
    private int couleur ;
    
    public Joueur (int couleur){
		this.couleur = couleur ;
	}

	public int getColor() {
		return this.couleur;
	}

	public int getEnnemi() {
        int res = 0 ;
        
        if (this.couleur == 1) {
            res = 2 ; 
        } else if (this.couleur == 2) {
            res = 1 ; 
        }
        return res ; 
    }

	public String getName() {
		String res = "undefined player";
        
        if (this.couleur == 1) {
            res = "Noir"; 
        } else if (this.couleur == 2) {
            res = "Blanc"; 
        }
        return res ;
	}
}	 
