package com.bloodbank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.models.BloodBank;

public interface BloodBankRepository extends JpaRepository<BloodBank, Integer> {

}
