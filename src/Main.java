
public class Main {

	public static void main(String[] args) {
		
		iPhone iPhone = new iPhone(
				"iPhone",					// Brand
				"Lightning",				// Connector
				"USB Power Adapter");		// Adapter
		
		Samsung Samsung = new Samsung(
				"Samsung",					// Brand
				"USB Type-C",				// Connector
				"USB Power Adapter");		// Adapter
		
		iPhone.unitedStatesConnection();
		System.out.println();
		Samsung.europeConnection();

	}

}
