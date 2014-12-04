package day7;

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
}

	public void addPatient (Patient newPatient) {
		
		if (this.nextPatient ==null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
		
	}
	
	public String toString () {
		return "Name: " + this.name +", age: " + this.age+ ", illness: " + illness;
	}
	
	public void printElements () {
		if (this.nextPatient== null) {
			System.out.println(this);
		} else {
			this.nextPatient.printElements();
			System.out.println(this);
		}
	}
	
	public boolean deletePatient (String name) {
		if (this.nextPatient == null) {
			return false;
		} else if ( this.nextPatient.name.equals(name)){
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(name);
		}
	}
	 
}
