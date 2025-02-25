package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	public int getPoids() {
		return poids;
	}

	public Sanglier(String nom, Unite unite, int poids, Gaulois chasseur) {
		super("sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		return this.getNom() + " de " + this.getPoids() + this.unite 
		+ " chasse par " + this.getChasseur() + ".";
	}

	public Gaulois getChasseur() {
		return chasseur;
	}
	
}
