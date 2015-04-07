package Day7;

public class CHospital {
	
	private static CPatient PatientListAddedLast = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		CPatient p1 = new CPatient ("Mark", 20, "internal bleeding");
		CPatient p2 = new CPatient ("John", 34, "headache");
		CPatient p3 = new CPatient ("Szilvia", 33, "back pain");
		CPatient p4 = new CPatient ("Flavio", 7, "fever");
		CPatient p5 = new CPatient ("Mario", 18, "muscle pain");
		CPatient p6 = new CPatient ("Jessica", 24, "bronchitis");
		CPatient p7 = new CPatient ("Maria", 65, "diabetis");
		CPatient p8 = new CPatient ("Elizabeth", 80, "concussion");
		CPatient p9 = new CPatient ("Simon", 50, "aa");
		CPatient p10 = new CPatient ("Monica", 20, "ss");
	
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

		
		PatientListAddedLast.deletePatient("Simon");
		PatientListAddedLast.deletePatient("Flavio");
		System.out.println();
		PatientListAddedLast.printElements();
	

	}

}
