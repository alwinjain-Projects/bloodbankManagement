package com.bloodbank.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.models.BloodBank;
import com.bloodbank.models.BloodStock;
import com.bloodbank.models.Seeker;
import com.bloodbank.repositories.BloodBankRepository;
import com.bloodbank.repositories.BloodStockRepository;
import com.bloodbank.repositories.SeekerRepository;

@Service
public class ServiceImpl implements IService {
	@Autowired
	SeekerRepository seekerRepository;
	
	@Autowired
	BloodBankRepository bloodBankRepository;
	
	@Autowired
	BloodStockRepository bloodStockRepository;

	@Override
	public void insertSeeker(Seeker seeker) {
		
		List<Seeker> insertUpdate = seekerRepository.findAll();
		for (Seeker seeker2 : insertUpdate) {
			if(seeker2.getSeekerId() == seeker.getSeekerId()) 
			{
				seekerRepository.save(seeker);
				System.out.println("hey");
			}
			else 
			{
				seekerRepository.save(seeker);
			}
		}

		

	}

	@Override
	public void insertSeekerDetails(Seeker seeker) {
		seekerRepository.save(seeker);
		
	}

	@Override
	public void insertBloodBank(BloodBank bloodBank) {
		bloodBankRepository.save(bloodBank);
		
	}

	@Override
	public void insertBloodStock(BloodStock bloodStock) {
		bloodStockRepository.save(bloodStock);
		
	}

	@Override
	public List<Seeker> viewSeekerDetails() {
		List<Seeker> list = seekerRepository.findAll();
		return list;
		
	}

	@Override
	public List<BloodStock> viewBloodStockInfo() {
		List<BloodStock> list = bloodStockRepository.findAll();
		return list;
	}

	@Override
	public void deleteSeekerById(int id) {
		seekerRepository.deleteById(id);
		
	}
	@Override
	public void deleteBloodBankById(int id) {
		bloodBankRepository.deleteById(id);
		
	}
	@Override
	public void deleteBloodStockById(int id) {
		bloodStockRepository.deleteById(id);
		
	}

	@Override
	public Optional<Seeker> getSeekerById(int id) {
		Optional<Seeker> seeker = seekerRepository.findById(id);
		return seeker;
	}

	@Override
	public List<BloodBank> viewBloodBankDetails() {
		List<BloodBank> list = bloodBankRepository.findAll();
		return list;
		
	}

}
