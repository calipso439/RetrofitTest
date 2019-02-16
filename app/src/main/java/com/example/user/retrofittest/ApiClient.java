package com.example.user.retrofittest;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


public class ApiClient {

    private static Retrofit retrofit=null;
    private static String Base_Url= "https://api.spacexdata.com/";
    public static Retrofit getClient(){
        if(retrofit== null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient())
                    .build();
            return retrofit;
        }
        return retrofit;

    }
}
