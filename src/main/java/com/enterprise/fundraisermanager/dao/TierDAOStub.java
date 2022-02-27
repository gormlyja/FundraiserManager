package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TierDAOStub implements ITierDAO {
    Map<Integer, Tier> allTiers = new HashMap<>();

    @Override
    public Tier save(Tier tier) throws Exception {
        allTiers.put(tier.getTierId(), tier);
        return tier;
    }

    @Override
    public List<Tier> fetchAll() {
        List<Tier> returnTiers = new ArrayList<>(allTiers.values());
        return returnTiers;
    }

    @Override
    public Tier fetch(int tierId) {
        return allTiers.get(tierId);
    }

    @Override
    public void delete(int tierId) {
        allTiers.remove(tierId);
    }
}
