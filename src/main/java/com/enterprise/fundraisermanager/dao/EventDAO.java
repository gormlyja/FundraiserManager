package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class EventDAO implements IEventDao{
    @Override
    public List<Fundraiser> fetchFundraisers(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IEventRetrofitDAO eventRetrofitDAO = retrofitInstance.create(IEventRetrofitDAO.class);
        Call<List<Fundraiser>> allFundraisers = eventRetrofitDAO.getFundraisers(combinedName);
        Response<List<Fundraiser>> execute = allFundraisers.execute();
        List<Fundraiser> fundraisers = execute.body();
        return fundraisers;

    }
}
