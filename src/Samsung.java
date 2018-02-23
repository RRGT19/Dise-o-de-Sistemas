
public class Samsung extends Smartphone implements IeuropeConnection {

	// Variables
	private String cableName = "USB Type C to USB Cable";
	private String cableStart = "Type-C";
	private String cableEnd = "USB";
	
	// Constructor
	public Samsung(String brand, String connector, String adapter) {
		super(brand, connector, adapter);
		this.brand = brand;
		this.connector = connector;
		this.adapter = adapter;
	}

	// Getters
	public String getCableName() {
		return cableName;
	}

	public String getCableStart() {
		return cableStart;
	}

	public String getCableEnd() {
		return cableEnd;
	}

	@Override
	public void europeConnection() {
		System.out.println("Se necesita un " + cableName);
		conector(connector);
	}

	@Override
	public void conector(String connector) {
		System.out.println(brand + " conectado con un " + connector + " a un " + adapter);
	}

}
