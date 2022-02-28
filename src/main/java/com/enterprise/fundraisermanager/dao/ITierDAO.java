package com.enterprise.fundraisermanager.dao;
import com.enterprise.fundraisermanager.dto.Tier;
import java.util.List;

/**
 * @author Jacob Gormly, Rahul Shakya, Binod Dahal, Amin Vedant, Juan Lopez Rosado
 * @date 2/27/2022
 * @version 1.0
 *
 */

public interface ITierDAO {
    Tier save(Tier tier) throws Exception;

    List<Tier> fetchAll();

    Tier fetch(int tierId);

    void delete(int tierId);
}

