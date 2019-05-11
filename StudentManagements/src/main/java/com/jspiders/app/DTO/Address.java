package com.jspiders.app.DTO;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String fullAddress;
	private String city;
	private long pinCode;
	private String state;
	private String country;
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [fullAddress=" + fullAddress + ", city=" + city + ", pinCode=" + pinCode + ", state=" + state
				+ ", country=" + country + "]";
	}
	public Address() {
		super();
	}
	
}
