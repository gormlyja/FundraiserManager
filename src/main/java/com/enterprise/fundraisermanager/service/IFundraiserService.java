package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.Fundraiser;

import java.util.List;

/**
 * The logic of the Fundraiser DTO is handled by FundraiserServiceStub. This interface allows you to see all of your saved fundraisers, create new ones, remove fundraisers, and search for fundraisers.
 * @author
 */
public interface IFundraiserService {
    /**
     * Fetch a fundraiser with given ID.
     * @param id a unique identifier for a fundraiser.
     * @return the matching specimen, or null if no matches found.
     */
    Fundraiser fetchById(int id);

    void delete(int id) throws Exception;

    Fundraiser save(Fundraiser fundraiser) throws Exception;

    List<Fundraiser> fetchAll(String searchTerm);

    List<Fundraiser> fetchAll();
}
