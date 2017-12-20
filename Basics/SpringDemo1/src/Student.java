
public class Student {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	private String name;
	private int rollNumber;
	
	public void displayInformation() {
		System.out.println("Name : -> "+name+"\nRoll Number : ->"+rollNumber);
	}

}
