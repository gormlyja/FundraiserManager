package com.enterprise.fundraisermanager.dao;

/**
 * @author Jacob Gormly, Rahul Shakya, Binod Dahal, Amin Vedant, Juan Lopez Rosado
 * @date 2/27/2022
 * @version 1.0
 *
 */

import com.enterprise.fundraisermanager.dto.Fundraiser;

import java.util.List;

public interface IFundraiserDAO {
    Fundraiser save(Fundraiser fundraiser) throws Exception;

    List<Fundraiser> fetchAll();

    Fundraiser fetch(int id);

    void delete(int id);
}
