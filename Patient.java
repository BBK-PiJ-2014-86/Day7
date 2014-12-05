package day7;

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	
	public Patient () {
		nextPatient = null;
		previousPatient = null;
	}
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
}

	public void addPatient (Patient newPatient) {
		
		if (this.nextPatient ==null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
		
	}
	
	public void traverseBack () {
		
		Patient last;
		last = this;
		
		while (last.nextPatient != null) {
			last = last.nextPatient;
		}
		
		while (true) {
			System.out.println(last);
			last = last.previousPatient;
			
			if (last.previousPatient==null) {
				System.out.println(last);
				break;
			}
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
			this.nextPatient.nextPatient.previousPatient = this;
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(name);
		}
	}
	 
}
