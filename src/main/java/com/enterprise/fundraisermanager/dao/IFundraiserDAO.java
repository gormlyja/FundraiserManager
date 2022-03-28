package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;

import java.util.List;

public interface IFundraiserDAO {
    Fundraiser save(Fundraiser fundraiser) throws Exception;

    List<Fundraiser> fetchAll();

    Fundraiser fetch(int id);

    void delete(int id);
}
