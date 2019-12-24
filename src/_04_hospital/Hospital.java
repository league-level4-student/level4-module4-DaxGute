package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList <Doctor> staff = new ArrayList <Doctor> ();
	ArrayList <Patient> Patience = new ArrayList <Patient> ();
	
	public void addDoctor(Doctor a) {
		staff.add(a);
	}
	
	public void addPatient(Patient a) {
		Patience.add(a);
	}
	
	public ArrayList <Doctor> getDoctors() {
		return staff;
	}
	
	public ArrayList <Patient> getPatients() {
		return Patience;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int PatientsNotAssigned = Patience.size();
		int staffNum = 0;
		while (PatientsNotAssigned > 0){
			try {
				staff.get(staffNum).assignPatient(Patience.get(PatientsNotAssigned - 1));
				PatientsNotAssigned --;
			} catch (DoctorFullException e) {
				staffNum ++;
			}
		}
		
	}
}
