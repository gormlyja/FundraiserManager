package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;

import org.springframework.data.repository.CrudRepository;

public interface FundraiserRepository extends CrudRepository<Fundraiser, Integer> { 
}
