package produit;

public class Poisson extends Produit{
	private String datePeche;

	public Poisson(String nom, Unite unite, String datePeche) {
		super("poisson", unite);
		this.datePeche = datePeche;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		return this.getNom() + "peches " + datePeche;
	}

}
