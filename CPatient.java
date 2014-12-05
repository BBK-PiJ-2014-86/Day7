package day7;


public class CPatient {
	private String name;
	private int age;
	private String illness;
	private CPatient nextPatient;
	private boolean first;
	
	
	public CPatient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = this;
		this.first=true;
}

	public void addPatient (CPatient newPatient) {
		
		if (this.nextPatient.first) {
			CPatient first1 = this.nextPatient;
			
			this.nextPatient = newPatient;
			newPatient.first = false;
			newPatient.nextPatient = first1;
			
		} else if (this.nextPatient.nextPatient.first) {
			CPatient first1 = this.nextPatient.nextPatient;
			this.nextPatient = newPatient;
			this.nextPatient.first = false;
			this.nextPatient.nextPatient = first1;
			
		} else {
			this.nextPatient.addPatient(newPatient);
		}
		
		
	}
	
	public String toString () {
		return "Name: " + this.name +", age: " + this.age+ ", illness: " + illness;
	}
	
	public void printElements () {
		
		if (this.nextPatient.first) {
			System.out.println(this);
		} else {
			this.nextPatient.printElements();
			System.out.println(this);
		}
	}
	
	public boolean deletePatient (String name) {
		
		if (this.first) {
			return false;
		}else if (this.nextPatient.nextPatient.first && this.nextPatient.name.equals(name)) {
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
			
		} else if (this.nextPatient.name.equals(name)){
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(name);
		}
	}
	 
}
