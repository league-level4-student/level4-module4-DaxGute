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

	public void assignPatientsToDoctors() {
		for (int i = 0; i < staff.size(); i++) {
			for (int j = i*3; j < (i+1)*3; j++) {
				try {
					staff.get(i).assignPatient(Patience.get(j));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
