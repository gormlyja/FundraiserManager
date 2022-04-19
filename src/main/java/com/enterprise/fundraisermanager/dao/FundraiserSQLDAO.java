package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fundraiserSQLDAO")
public class FundraiserSQLDAO implements ITierDAO{

    @Autowired
    FundraiserRepository fundraiserRepository;

    @Override
    public Tier save(Tier tier) throws Exception {
        Fundraiser createdFundraiser = fundraiserRepository.save(tier);
        return createdFundraiser;
    }

    @Override
    public List<Fundraiser> fetchAll() {
        return null;
    }

    @Override
    public Fundraiser fetch(int fundraiserId) {
        return null;
    }

    @Override
    public void delete(int fundraiserId) {

    }
}
