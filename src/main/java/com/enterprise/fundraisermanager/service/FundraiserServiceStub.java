package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.IFundraiserDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FundraiserServiceStub implements IFundraiserService{

    private IFundraiserDAO fundraiserDAO;

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
    public Fundraiser save(Fundraiser fundraiser) throws Exception{
        return fundraiserDAO.save(fundraiser);
    }

    @Override
    public List<Fundraiser> fetchAll() {
        return fundraiserDAO.fetchAll();
    }
}