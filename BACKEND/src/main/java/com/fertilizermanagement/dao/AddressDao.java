package com.fertilizermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fertilizermanagement.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
