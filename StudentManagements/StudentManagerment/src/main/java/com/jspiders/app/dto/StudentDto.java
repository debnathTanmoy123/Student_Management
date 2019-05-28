package com.jspiders.app.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Student_Table")
public class StudentDto {

	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	@Column(name="Student_Id")
	public long studentId;
	@Column(name="First_Name")
	public String firstName;
	@Column(name="Last_Name")
	public String lastName;
	@Column(name="Mobile_Number")
	public String mobileNo;
	@Column(name="Stream")
	public String stream;
	@Column(name="Date_Of_Birth")
	public Date dateOfBirth;
	@Column(name="Email")
	public String email;
	@Column(name="Password")
	public String password;
	@Column(name="Login_Id")
	public String loginId;
	@Column(name="Is_Marrid")
	public boolean isMarried;
	@Column(name="Father's_Name")
	public String fatherName;
	@Column(name="Mother's_Name")
	public String motherName;
	
	@Embedded
	public Address address;
	
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
		return "StudentDto [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNo=" + mobileNo + ", stream=" + stream + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", password=" + password + ", loginId=" + loginId + ", isMarried=" + isMarried + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", address=" + address + "]";
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(String firstName, String lastName, String mobileNo, String stream, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.stream = stream;
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	
}
