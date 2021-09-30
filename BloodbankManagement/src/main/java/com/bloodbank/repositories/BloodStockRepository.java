package com.bloodbank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.models.BloodStock;

public interface BloodStockRepository extends JpaRepository<BloodStock, Integer> {

}
