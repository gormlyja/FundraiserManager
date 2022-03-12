package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.IFundraiserDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * This class determines the application's boundary.
 * It is a set of feasible operations from the perspective of interfacing client layers.
 * It contains the application's business logic, manages transactions, and coordinates responses during operation execution.
 * Implements IFundraiserEntryService's methods
 * @author
 */
@Service
public class FundraiserServiceStub implements IFundraiserService{

    @Autowired
    IFundraiserDAO fundraiserDAO;

    public FundraiserServiceStub() {

    }

    public FundraiserServiceStub(IFundraiserDAO fundraiserDAO) {
        this.fundraiserDAO = fundraiserDAO;
    }

    @Override
    public Fundraiser fetchById(int id) {
         return fundraiserDAO.fetch(id);
    }

    @Override
    @Cacheable(value="delete", key ="#id")
    public void delete(int id) throws Exception {
        fundraiserDAO.delete(id);
    }

    @Override
    public Fundraiser save(Fundraiser fundraiser) throws Exception{
        return fundraiserDAO.save(fundraiser);
    }

    @Override
    public List<Fundraiser> fetchAll(String searchTerm) {
        return fundraiserDAO.fetchAll();
    }

    @Override
    public List<Fundraiser> fetchAll() {
        return fundraiserDAO.fetchAll();
    }

}