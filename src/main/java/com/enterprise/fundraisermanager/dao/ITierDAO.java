package com.enterprise.fundraisermanager.dao;
import com.enterprise.fundraisermanager.dto.Tier;
import java.util.List;

public interface ITierDAO {
    Tier save(Tier tier) throws Exception;

    List<Tier> fetchAll();

    Tier fetch(int tierId);

    void delete(int tierId);
}

