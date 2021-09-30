package com.bloodbank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloodbank")
public class BloodBank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bloodbank_id")
	private int bloodBankId;
	@Column(name = "bloodbank_name")
	private String bloodBankName;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private String phone;
	@Column(name = "website")
	private String website;
	@Column(name = "email")
	private String email;

	// Empty Constructor
	public BloodBank() {
		super();
	}

	// Parameterized Constructor
	public BloodBank(int bloodBankId, String bloodBankName, String address, String city, String phone, String website,
			String email) {
		super();
		this.bloodBankId = bloodBankId;
		this.bloodBankName = bloodBankName;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.website = website;
		this.email = email;
	}

	// Getter - Setter Method
	public int getBloodBankId() {
		return bloodBankId;
	}

	public void setBloodBankId(int bloodBankId) {
		this.bloodBankId = bloodBankId;
	}

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}