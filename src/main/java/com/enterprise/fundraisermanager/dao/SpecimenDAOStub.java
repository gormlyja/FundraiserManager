package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SpecimenDAOStub implements IFundraiserDAO{

    List<Fundraiser> allFundraisers = new ArrayList<Fundraiser>();

    @Override
    public Fundraiser save(Fundraiser fundraiser) throws Exception {
        allFundraisers.add(fundraiser);
        return fundraiser;
    }

    @Override
    public List<Fundraiser> fetchAll() {
        return null;
    }
}
