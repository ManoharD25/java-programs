package com.xworkz.crudoperation;

import com.xworkz.crudoperation.PatientDTO;

public class Hospital {

	public PatientDTO patientDTO[];
	
	int index;
	
	public Hospital(int size) {
		
		patientDTO = new PatientDTO[size]; 
	}
	
	public boolean createPatientDetails(PatientDTO patient) {
		boolean patientadded = false;
		
		if(patient !=null) {
			patientDTO[index++]=patient;
			return true;
		}
		
		else {
			System.out.println("No patient found");
		}
		
		return patientadded;
	}
	
	public PatientDTO getPatientDetails() {
		PatientDTO patient = null ;
		try {
		
		for (int i = 0; i < patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
			
		}
		
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
	}
	
	public PatientDTO getPatientById(int patientId) {
		PatientDTO patient = null ;
		try {
			for (int i = 0; i < patientDTO.length; i++) {
		
				if (patientDTO[i].getPatientId()==patientId) {
				System.out.println(patientDTO[i]+ "\t By patient ID");
				break;
				} 
				else {
				System.out.println("\t Patient name not found");
				}
			}
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		return patient;
	}
	
	public PatientDTO getPatientByName(String patientName) {
		PatientDTO patient = null;
	try {	
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getPatientName().equals(patientName)) {
				System.out.println(patientDTO[i] + "\t By patientName");
				break;
			}
			else {
				System.out.println("\t Patient name not found");
			}
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
		}	
		return patient;
	}
	
	public PatientDTO getPatientByGender(String gender) {
		PatientDTO patient = null;
	try {	
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getGender().equals(gender)) {
				System.out.println(patientDTO[i] + "\t By gender");
				break;
			} 
			else {
				System.out.println("Didnt find the patient");
			}
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
		
	}		
		return patient;
	}
	
	public PatientDTO getpatientByContactNo(long contactno) {
		PatientDTO patient = null;
	try {		
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getContactno() == contactno) {
				System.out.println(patientDTO[i]+" By Contact nor");
				break;
			} 
			else {
				System.out.println("Didnt find the patient");
			}
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
		
	}		
		return patient;
		
	}
	
	public PatientDTO getPatientByAge(int age) {
		PatientDTO patient = null;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getAge()==age) {
				System.out.println(patientDTO[i] + "\t by age");
				break;
			} 
			else {
				System.out.println("Didnt find the patient");
			}
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
	}	
		return patient;
	}
	
	public PatientDTO getPatientByAdress(String adress) {
		PatientDTO patient = null;
		try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getAdress().equals(adress)) {
				System.out.println(patientDTO[i] + "\t by adress");
			} 
			else {
				System.out.println("Didnt find the patient");
			}
		}
		} catch (NullPointerException e) {
			System.out.println(e.fillInStackTrace());
		}	
		return patient;
	}
	
	public String getPatientNameById(String patientName , int patientId) {
		String patient = null;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getPatientId()==patientId) {
				System.out.println(patientDTO[i].getPatientName() + "\t name by Id");
				break;
			} 
			else {
				System.out.println("Didnt find the patientID");
			}
		}
	} catch (Exception e) {
		System.out.println(e.fillInStackTrace());
	}	
		return patient;
	}
	
	public int  getPatientIdByName(String patientName , int patientId) {
		int id = 0;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getPatientName().equals(patientName)) {
				System.out.println(patientDTO[i].getPatientId());
				break;
			} 
			else {
				System.out.println("Didnt find the patientID");
			}
		}
		
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
	}	
		return id;
	}
	
	public String getAdressByName(String adress, String patientName) {
		String address = null;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getPatientName().equals(patientName)) {
				System.out.println(patientDTO[i].getAdress()+"\t adress by name");
				break;
			} 
			else {
				System.out.println("Not found the adress in "+i);
			}
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
		}	
		return address;
	}
	
	public boolean getUpdateContactNo(String patientName, int contactno) {
		
		boolean update =false;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			
			if (patientDTO[i].getPatientName().equals(patientName)) {
				
				patientDTO[i].setContactno(contactno);
				System.out.println(contactno);
				return true;
			} 
			else {
				System.out.println("Contact nor Dint updated");
			}
			
		}
	} catch (NullPointerException e) {
		System.out.println(e.fillInStackTrace());
	}	
		return update;
	}
	
	
	
	public boolean deletePatientDetails(String patientName) {
		boolean delete = false;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			
			if (patientDTO[i].getPatientName().equals(patientName)) {
				patientDTO[i] = null;
				System.out.println("Patient details are deleted");
				return true;
				
			} 
			else {
				System.out.println("Patient Details dint deleted");
			}
		}
		
	} catch(NullPointerException n) {
		System.out.println(n.fillInStackTrace());
		}
		
		
		return delete;
	}
	
	
	public int getContactByAdress(int contactno, String adress) {
		int contact = 0;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getAdress().equals(adress)) {
				System.out.println(patientDTO[i].getContactno());
			} 
			else {
				System.out.println("Patient adress not found in Patint no "+i+"\t ");
			}
		}
	} catch(NullPointerException n) {
		System.out.println(n.fillInStackTrace());
	
}
		return contact;
		
	}
	
	public String getDeseaseByContactNo(String desease, int contactno) {
		String deseasE = null;
	try {
		for (int i = 0; i < patientDTO.length; i++) {
			if (patientDTO[i].getContactno()==contactno) {
				System.out.println(patientDTO[i].getDesease());
				
			} else {
				System.out.println("Contactno not found  in Patint no " +i+ "\t ");
			}
		}
		
	} catch(NullPointerException n) {
		System.out.println(n.fillInStackTrace());
	}
		return deseasE;
	}
	
	
} 


/* 
getPatientBy name, gender, contactno, age, adress,

getPatient  nameById, IdByName, AdressByname, deseaseBycontact,

updatecontactno ,  deletepatient,
*/