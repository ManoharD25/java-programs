package com.xworkz.crudoperation;

import com.xworkz.gender.Gender;

public class PatientDTO {

	

	private int patientId;
	private String patientName;
	private String adress;
	private Gender gender;
	private int age;
	private String desease;
	private int contactno;
	
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
		
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDesease() {
		return desease;
	}
	
	public void setDesease(String desease) {
	
		this.desease = desease;
	}
	
	
	public int getContactno() {
		return contactno;
	}
	
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	
	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", patientName=" + patientName + ", adress=" + adress
				+ ", gender=" + gender + ", age=" + age + ", desease=" + desease + ", contactno=" + contactno + "]";
	}
	
	
}
