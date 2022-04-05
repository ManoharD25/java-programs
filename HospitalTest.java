package com.xworkz.crudoperation;
import java.util.Scanner;
import com.xworkz.crudoperation.PatientDTO;
import com.xworkz.crudoperation.Hospital;
import com.xworkz.gender.Gender;
public class HospitalTest {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("eneter the array size ");
	int size=sc.nextInt();
		Hospital hospital = new Hospital(size);
		
		
	for (int i = 0; i <size; i++) {
	
		PatientDTO patient = new PatientDTO();
		System.out.println( "Eneter patient no " + (i+1) + "  Id " );
		patient.setPatientId(sc.nextInt());
		System.out.println("Eneter the patient name");
		patient.setPatientName(sc.next());
		System.out.println("Enter the patient gender");
		String gender = sc.next();
		patient.setGender(Gender.valueOf(gender));
		
		/*
		System.out.println("Eneter the patient adress");
		patient.setAdress(sc.next());
		System.out.println("Enter the patient gender");
		patient.setGender(sc.next());
	
		System.out.println("Eneter the patient age");
		patient.setAge(sc.nextInt());
		
		
		System.out.println("Eneter the patient desease");
		patient.setDesease(sc.next());
		System.out.println("Eneter the patient contactno ");
		patient.setContactno(sc.nextInt());
		System.out.println();
		hospital.createPatientDetails(patient);
		*/
	}
	/*
	hospital.getPatientDetails();
	
	System.out.println("Enter patientId ");
	hospital.getPatientById(sc.nextInt());

	System.out.println("Enter the name");
	hospital.getPatientByName(sc.next());
	*/
	
	
	System.out.println("Enter the gender");
	hospital.getPatientByGender(sc.next());
	
	/*
	System.out.println("Enter the contactno");
	hospital.getpatientByContactNo(sc.nextInt());
	
	
	System.out.println("Enter the age");
	hospital.getPatientByAge(sc.nextInt());
	
	
	System.out.println("Enter the adress");
	hospital.getPatientByAdress(sc.next());
	
	System.out.println("Enter the name and id");
	hospital.getPatientNameById(sc.next(), sc.nextInt());
	

	System.out.println("Enter the name and id");
	hospital.getPatientIdByName(sc.next(),sc.nextInt());
	
	System.out.println("Enter the adress and name");
	hospital.getAdressByName(sc.next(), sc.next());
	
	System.out.println("Enter patientName and new contactNor");
	hospital.getUpdateContactNo( sc.next(), sc.nextInt());
	
	
	
	System.out.println("Enter patientName");
	hospital.deletePatientDetails(sc.next());
	

	
	
	System.out.println("Enter contactNo and adress");
	hospital.getContactByAdress(sc.nextInt(), sc.next());
	
	
	System.out.println("Enter  desease and contactNo  ");
	hospital.getDeseaseByContactNo(sc.next(), sc.nextInt());
	
	*/
	
	
	}

	
}






