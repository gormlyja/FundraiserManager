package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("tierDAO")
public class TierSQLDAO implements ITierDAO{

    @Autowired
    TierRepository tierRepository;

    @Override
    public Tier save(Tier tier) throws Exception {
        Tier createdTier = tierRepository.save(tier);
        return createdTier;
    }

    @Override
    public List<Tier> fetchAll() {
        return null;
    }

    @Override
    public Tier fetch(int tierId) {
        return null;
    }

    @Override
    public void delete(int tierId) {

    }
}
