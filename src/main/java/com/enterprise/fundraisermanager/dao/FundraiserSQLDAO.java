package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fundraiserSQLDAO")
public class FundraiserSQLDAO implements IFundraiserDAO{

    @Autowired
    FundraiserRepository fundraiserRepository;

    @Override
    public Fundraiser save(Fundraiser fundraiser) throws Exception {
        Fundraiser createdFundraiser = fundraiserRepository.save(fundraiser);
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
