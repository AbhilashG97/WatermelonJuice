
public class Icing {
	
	private Flavour icingFlavour;
	private String color;
	
	public Icing(Flavour flavour, String color) {
		this.icingFlavour = flavour;
		this.color = color;
	}

	public Icing(Flavour flavour) {
		this.icingFlavour = flavour;
	}

	public Icing(String color) {
		this.color = color;
	}

	public Flavour getIcingFlavour() {
		return icingFlavour;
	}

	public String getColor() {
		return color;
	}
}
