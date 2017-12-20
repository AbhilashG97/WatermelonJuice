
public class Car {
	
	private Engine engine;
	private Tyre tyre;
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Tyre getTyre() {
		return tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void displayDetails() {
		System.out.println("Engine :-> "+"\nEngine Type :-> "+getEngine().getEngineType()+
				"\nEngine Output :-> "+getEngine().getPowerOutput());
		System.out.println("\n---------------xx--------------\n");
		System.out.println("Tyre :->"+"\nTyre type :-> "+getTyre().getTyreType()+
				"\nTyre size :-> "+getTyre().getTyreSize());
	}
}
