package tests;

import static org.junit.Assert.*; 

import org.junit.Test;

import model.Patient;

public class PublicTests {
	
	@Test
	public void testDatabase() {
		Patient p1 = new Patient ("Bob", 15.0, 50); 
		p1.addData("12:00", 40);
		p1.addData("1:00", 45);
		p1.addData("2:00", 35);
		System.out.println (Patient.getPatientData(p1)); 
		System.out.println (p1.getDiagnosis());
		Patient p2 = new Patient ("Kelly", 50, 45);
		p2.addData("12:00", 90);
		p2.addData("1:00", 20);
		System.out.println(Patient.getPatientData(p2));
		System.out.println(p2.getDiagnosis());
		System.out.println(Patient.getPatientDatabase());
		
	}
}

