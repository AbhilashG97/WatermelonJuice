import java.util.List;

public class IceCream {
	
	private List<Flavour> flavours;

	public List<Flavour> getFlavours() {
		return flavours;
	}

	public void setFlavours(List<Flavour> flavours) {
		this.flavours = flavours;
	}
	
	public void displayDetails() {
		int count = 1;
		for(Flavour flavour : flavours) {
			System.out.println("Flavour "+count+" -> "+flavour.getFlavour());
			count++;
		}
	}
}
