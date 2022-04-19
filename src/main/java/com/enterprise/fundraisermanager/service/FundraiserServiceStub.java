package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.IEventDao;
import com.enterprise.fundraisermanager.dao.IFundraiserDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FundraiserServiceStub implements IFundraiserService{

    @Autowired
    private IFundraiserDAO fundraiserDAO;

    @Autowired
    private IEventDao eventDao;

    public FundraiserServiceStub() {

    }

    public FundraiserServiceStub(IFundraiserDAO fundraiserDAO) {
        this.fundraiserDAO = fundraiserDAO;
    }

    @Override
    public Fundraiser fetchById(int id) {
        Fundraiser fundraiser = new Fundraiser();
        fundraiser.setDescription("Girl Scout Cookie Fundraiser");
        fundraiser.setId(12345);
        return fundraiser;
    }

    @Override
    public void delete(int id) throws Exception {
        fundraiserDAO.delete(id);
    }

    @Override
    public Fundraiser save(Fundraiser fundraiser) throws Exception{
        return fundraiserDAO.save(fundraiser);
    }

    @Override
    public List<Fundraiser> fetchAll() {
        return fundraiserDAO.fetchAll();
    }

    @Override
    public List<Fundraiser> fetchFundraiser(String combinedName) throws IOException {
        return eventDao.fetchFundraisers(combinedName);
    }

    /**
     * Any methods not included in lecture. TODO Remove this later in project
     *
     * @param fundraiser
     */
}