package scenarioTest;

import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		//IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		//marche[1] = etalPoisson;
	}
	
}
