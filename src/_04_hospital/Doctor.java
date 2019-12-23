package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList <Patient> CurrentPatients = new ArrayList <Patient> ();
	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (CurrentPatients.size() <= 2) {
			CurrentPatients.add(patient);
		}else {
			throw new DoctorFullException();
		}

	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return CurrentPatients;
	}

	public void doMedicine() {
		for (int i = 0; i < CurrentPatients.size(); i++) {
			CurrentPatients.get(i).checkPulse();
		}
	}

}
