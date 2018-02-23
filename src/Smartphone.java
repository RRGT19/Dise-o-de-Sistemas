
public class Smartphone {
	
	// Variables
	protected String brand;
	protected String connector;
	protected String adapter;
	
	// Constructor
	public Smartphone(String brand, String connector, String adapter) {
		super();
		this.brand = brand;
		this.connector = connector;
		this.adapter = adapter;
	}
	
	// Getters
	public String getBrand() {
		return brand;
	}

	public String getConnector() {
		return connector;
	}

	public String getAdapter() {
		return adapter;
	}

}
