package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.Fundraiser;

import java.util.List;

public interface IFundraiserService {
    /**
     * Fetch a fundraiser with given ID.
     * @param id a unique identifier for a fundraiser.
     * @return the matching specimen, or null if no matches found.
     */
    Fundraiser fetchById(int id);

    /**
     * Delete a fundraiser with given ID.
     * @param id a unique identifier for a fundraiser.
     */
    void delete(int id) throws Exception;

    /**
     * Save a fundraiser with given ID.
     * @param fundraiser a fundraiser object.
     * @return the fundraiser after being saved.
     */
    Fundraiser save(Fundraiser fundraiser) throws Exception;

    /**
     * Fetch all fundraisers.
     * @return list of all fundraisers.
     */
    List<Fundraiser> fetchAll();
}
