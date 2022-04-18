package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TierDAO {

@Autowired
private TierRepository tierRepository;

public void save (Tier tier){
    tierRepository.save(tier);
}
}
