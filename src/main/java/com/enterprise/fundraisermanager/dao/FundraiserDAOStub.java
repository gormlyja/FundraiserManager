package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The DAO provides Fundraiser data to the service layer.
 * <p>
 * This class provides non-persistent Fundraiser data, and is used before data can be retrieved from database.
 * </p>
 */
@Repository
public class FundraiserDAOStub implements IFundraiserDAO{

    Map<Integer, Fundraiser> allFundraisers = new HashMap<>();

    @Override
    public Fundraiser save(Fundraiser fundraiser) throws Exception {
        allFundraisers.put(fundraiser.getId(), fundraiser);
        return fundraiser;
    }

    @Override
    public List<Fundraiser> fetchAll() {
        List<Fundraiser> returnFundraisers = new ArrayList<>(allFundraisers.values());
        return returnFundraisers;
    }

    @Override
    public Fundraiser fetch(int id) {
        return allFundraisers.get(id);
    }

    @Override
    public void delete(int id) {
        allFundraisers.remove(id);
    }
}
