package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.Tier;

import java.util.List;

public interface ITierService {

    Tier fetchById(int tierId, Fundraiser fundraiser);

    void delete(int tierId) throws Exception;

    Tier save(Tier tier) throws Exception;

    List<Tier> fetchAll()throws Exception;
}
