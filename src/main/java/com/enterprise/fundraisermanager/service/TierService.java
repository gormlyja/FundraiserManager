package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.ITierDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TierService implements ITierService{
    @Autowired
    private ITierDAO tierDAO;

    @Override
    public Tier fetchById(int tierId, Fundraiser fundraiser) {
        return null;
    }

    @Override
    public void delete(int tierId) throws Exception {

    }

    @Override
    public Tier save(Tier tier) throws Exception {
        return null;
    }

    @Override
    public List<Tier> fetchAll() {
        return null;
    }

    @Override
    public void saveTier() throws Exception {

    }

    @Override
    public void saveTier(Tier tier) throws Exception {

    }
}
