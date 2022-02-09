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

    Fundraiser save(Fundraiser fundraiser) throws Exception;

    List<Fundraiser> fetchAll();
}
