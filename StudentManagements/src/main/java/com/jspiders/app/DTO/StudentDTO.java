package com.jspiders.app.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Student_Table")
public class StudentDTO implements Serializable{
	
	
	
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc", strategy ="increment" )
	private int id;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Gender")
	private String gender;
	@Column(name="Age")
	private int age;
	@Column(name="Mobile_Number")
	private String mobileNo;
	@Column(name="Stream")
	private String stream;
	@Column(name="Date_Of_Birth")
	private Date dateOfBirth;
	@Column(name="Father's_Name")
	private String fathersName;
	@Column(name="Mothers_Name")
	private String mothersName;
	@Column(name="Marital_Status")
	private boolean isMarrid;
	@Column(name="Degree")
	private String degree;
    @Embedded
	private Address address;
	

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

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public boolean isMarrid() {
		return isMarrid;
	}

	public void setMarrid(boolean isMarrid) {
		this.isMarrid = isMarrid;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", mobileNo=" + mobileNo + ", stream=" + stream + ", dateOfBirth=" + dateOfBirth
				+ ", fathersName=" + fathersName + ", mothersName=" + mothersName + ", isMarrid=" + isMarrid
				+ ", degree=" + degree + ", address=" + address + "]";
	}
	
	

	public StudentDTO() {
		super();
	}

}
