package com.enterprise.fundraisermanager.dao;
import com.enterprise.fundraisermanager.dto.Fundraiser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IEventRetrofitDAO {

    @GET("/fundraisers.json")
    Call<List<Fundraiser>> getFundraisers(@Query("Combined_Name") String combinedName);
}
