package com.bloodbank.services;

import java.util.List;
import java.util.Optional;

import com.bloodbank.models.BloodBank;
import com.bloodbank.models.BloodStock;
import com.bloodbank.models.Seeker;

public interface IService {
	
	public void insertSeeker(Seeker seeker);
	public void insertSeekerDetails(Seeker seeker);
	public void insertBloodBank(BloodBank bloodBank);
	public void insertBloodStock(BloodStock bloodStock);
	public List<Seeker> viewSeekerDetails();
	public List<BloodStock> viewBloodStockInfo();
	public void deleteSeekerById(int id);
	public void deleteBloodBankById(int id);
	public void deleteBloodStockById (int id);
	public Optional<Seeker> getSeekerById(int id);
	public List<BloodBank> viewBloodBankDetails();

}
