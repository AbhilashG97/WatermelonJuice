
public class Cake {
	
	private Flavour flavour;
	private Icing icing;
	
	public Cake(Flavour flavour, Icing icing) {
		this.flavour = flavour;
		this.icing = icing;
	}

	public Cake(Flavour flavour) {
		this.flavour = flavour;
	}

	public Cake(Icing icing) {
		this.icing = icing;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public Icing getIcing() {
		return icing;
	}
	
	public void displayDetails() {
		System.out.println("Flavour of the cake:-> "+getFlavour().getTaste());
		System.out.println("\n---------------------xx--------------------\n");
		System.out.println("Icing of the cake:-> \n\n"+"Icing flavour :-> "+getIcing().getIcingFlavour().getTaste());
		System.out.println("Icing color :-> "+getIcing().getColor());
	}
}
