package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.ITierDAO;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.Tier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TierServiceStub implements ITierService {
    private ITierDAO tierDAO;

    public TierServiceStub() {
}

    public TierServiceStub(ITierDAO tierDAO) {
        this.tierDAO = tierDAO;
    }

    @Override
    public Tier fetchById(int tierId, Fundraiser fundraiser) {
        Tier tier = new Tier();
        tier.setDescription("");

        Tier newTier = new Tier();
        newTier.setName("Tier 1");
        newTier.setRequiredAmount(5.00);

        ArrayList<Tier> tierList = new ArrayList<>();
        tierList.add(0, newTier);
        fundraiser.setTierList(tierList);

        return tierList.get(0);



    }

    @Override
    public void delete(int tierId) throws Exception {
        tierDAO.delete(tierId);
    }

    @Override
    public Tier save(Tier tier) throws Exception{
        return tierDAO.save(tier);
    }

    @Override
    public List<Tier> fetchAll() {
        return tierDAO.fetchAll();
    }

    @Override
    public void saveTier() throws Exception {

    }

    @Override
    public void saveTier(Tier tier) throws Exception {

    }

    /**
     * Any methods not included in lecture. TODO Remove this later in project
     *
     * @param fundraiser
     */
}
