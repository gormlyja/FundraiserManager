package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.Fundraiser;

import java.io.IOException;
import java.util.List;

public interface IFundraiserService {
    /**
     * Fetch a fundraiser with given ID.
     * @param id a unique identifier for a fundraiser.
     * @return the matching specimen, or null if no matches found.
     */
    Fundraiser fetchById(int id);

    void delete(int id) throws Exception;

    Fundraiser save(Fundraiser fundraiser) throws Exception;

    List<Fundraiser> fetchAll();

    List<Fundraiser> fetchFundraiser(String combinedName) throws IOException;
}
