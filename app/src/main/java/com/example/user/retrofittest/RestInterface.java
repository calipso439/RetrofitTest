package com.example.user.retrofittest;

import java.util.List;

import retrofit.http.GET;
import retrofit.Call;


public interface RestInterface {
    @GET("v2/launches")
    Call<List<Repo>> getRepo();
}
