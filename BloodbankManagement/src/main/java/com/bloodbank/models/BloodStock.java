package com.bloodbank.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloodstock")
public class BloodStock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bloodstock_id")
	private int bloodStockId;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "best_before")
	private String bestBefore;
	@Column(name = "status")
	private String status;

	// Empty Constructor
	public BloodStock() {
		super();
	}

	// Parameterized Constructor
	public BloodStock(int bloodStockId, String bloodGroup, String quantity, String bestBefore, String status) {
		super();
		this.bloodStockId = bloodStockId;
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
		this.bestBefore = bestBefore;
		this.status = status;
	}

	// Getter - Setter Method
	public int getBloodStockId() {
		return bloodStockId;
	}

	public void setBloodStockId(int bloodStockId) {
		this.bloodStockId = bloodStockId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}