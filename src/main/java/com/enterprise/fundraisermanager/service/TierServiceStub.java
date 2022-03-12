package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.ITierDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * This class determines the application's boundary.
 * It is a set of feasible operations from the perspective of interfacing client layers.
 * It contains the application's business logic, manages transactions, and coordinates responses during operation execution.
 * Implements ITierService's methods
 * @author
 */
@Service
public class TierServiceStub implements ITierService {


    @Autowired
    ITierDAO tierDAO;

    public TierServiceStub() {
}

    public TierServiceStub(ITierDAO tierDAO) {
        this.tierDAO = tierDAO;
    }

    @Override
    public Tier fetchById(int tierId, Fundraiser fundraiser) {
        return tierDAO.fetch(tierId);
    }

    @Override
    @Cacheable(value="delete", key ="#tierId")
    public void delete(int tierId) throws Exception {
        tierDAO.delete(tierId);
    }

    @Override
    public Tier save(Tier tier) throws Exception{
        return tierDAO.save(tier);
    }

    @Override
    public List<Tier> fetchAll() throws Exception {

        return tierDAO.fetchAll();
    }

}
