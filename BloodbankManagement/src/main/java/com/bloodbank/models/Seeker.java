package com.bloodbank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seeker")
public class Seeker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "seekerId")
	private int seekerId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "bloodGroup")
	private String bloodGroup;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private String phone;

	// Empty Constructor
	public Seeker() {
		super();
	}

	// Parameterized Constructor
	public Seeker(int seekerId, String firstName, String lastName, int age, String gender, String city,
			String bloodGroup, String phone) {
		super();
		this.seekerId = seekerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.bloodGroup = bloodGroup;
		this.phone = phone;
	}

	// Getter - Setter Method
	public int getSeekerId() {
		return seekerId;
	}

	public void setSeekerId(int seekerId) {
		this.seekerId = seekerId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}