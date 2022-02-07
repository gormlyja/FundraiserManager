package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.stereotype.Component;

@Component
public class FundraiserServiceStub implements IFundraiserService{
    @Override
    public Fundraiser fetchById(int id) {
        Fundraiser fundraiser = new Fundraiser();
        fundraiser.setDescription("Girl Scout Cookie Fundraiser");
        fundraiser.setId(12345);
        return fundraiser;
    }
}