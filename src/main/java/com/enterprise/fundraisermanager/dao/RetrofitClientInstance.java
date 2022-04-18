package com.enterprise.fundraisermanager.dao;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static String BASE_URL = "";

    public static Retrofit RetrofitClientInstance(){
        if (retrofit==null){
            retrofit=new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

