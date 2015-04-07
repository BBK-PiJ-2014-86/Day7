package Day7;

public class HospitalManager {
	
	private static Patient PatientListAddedLast = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Patient p1 = new Patient ("Mark", 20, "internal bleeding");
		Patient p2 = new Patient ("John", 34, "headache");
		Patient p3 = new Patient ("Szilvia", 33, "back pain");
		Patient p4 = new Patient ("Flavio", 7, "fever");
		Patient p5 = new Patient ("Mario", 18, "muscle pain");
		Patient p6 = new Patient ("Jessica", 24, "bronchitis");
		Patient p7 = new Patient ("Maria", 65, "diabetis");
		Patient p8 = new Patient ("Elizabeth", 80, "concussion");
		Patient p9 = new Patient ("Simon", 50, "aa");
		Patient p10 = new Patient ("Monica", 20, "ss");
	
		PatientListAddedLast = p1;
		PatientListAddedLast.addPatient(p2);
		PatientListAddedLast.addPatient(p3);
		PatientListAddedLast.addPatient(p4);
		PatientListAddedLast.addPatient(p5);
		PatientListAddedLast.addPatient(p6);
		PatientListAddedLast.addPatient(p7);
		PatientListAddedLast.addPatient(p8);
		PatientListAddedLast.addPatient(p9);
		PatientListAddedLast.addPatient(p10);
		
	
		PatientListAddedLast.printElements();
		System.out.println();
		PatientListAddedLast.traverseBack();
		System.out.println();
		
		PatientListAddedLast.deletePatient("Simon");
		PatientListAddedLast.deletePatient("Flavio");
		
		PatientListAddedLast.printElements();
		System.out.println();
		PatientListAddedLast.traverseBack();
		System.out.println();
		
		
		PatientListAddedLast.addPatient(new Patient ("Rob", 25, "Lupus"));
		
		PatientListAddedLast.printElements();
		System.out.println();
		PatientListAddedLast.traverseBack();
	}

}
