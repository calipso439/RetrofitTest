package com.example.user.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    RestInterface restInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restInterface=ApiClient.getClient().create(RestInterface.class);

        Call<List<Repo>> call=restInterface.getRepo();
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Response<List<Repo>> response, Retrofit retrofit) {
                List<Repo> repoList = response.body();
                for (int i=0;i<repoList.size();i++){
                    System.out.println("gelen cavab-------"+repoList.get(i).rocket.rocketId+"\n");
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }



        });

    }
}