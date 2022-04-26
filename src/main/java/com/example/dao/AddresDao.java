package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;
import com.example.model.Student;
@Repository
public interface AddresDao extends JpaRepository<Address, Integer> {

	

}
