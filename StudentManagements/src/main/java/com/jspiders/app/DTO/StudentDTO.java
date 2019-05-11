package com.jspiders.app.DTO;

import java.util.Date;

public class StudentDTO {
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String stream;
	private Date dateOfBirth;

	public StudentDTO(String firstName, String lastName, String mobileNo, String stream, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.stream = stream;
		this.dateOfBirth = dateOfBirth;
	}

	public StudentDTO(Date dateOfBirth) {
		super();
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "StudentDTO [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", stream="
				+ stream + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public StudentDTO() {
		super();
	}

}
