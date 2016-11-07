package com.volkov.soct.client;

import com.volkov.soct.client.model.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;

/**
 * Created by WoLf on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/ServerSOCT_war_exploded/soct/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ClientAPI api = retrofit.create(ClientAPI.class);

        Call<ArrayList<User>> responce = api.execSomeMethod();

        responce.enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Call<ArrayList<User>> call, Response<ArrayList<User>> response) {
                    for (int i =0; i < response.body().size(); i++){
                        System.out.println(response.body().get(i).getId() + " " +
                                response.body().get(i).getName() + " " + response.body().get(i).getPosition()
                        + " " + response.body().get(i).getTotalRepair() + " " + response.body().get(i).getTotalRecharge()
                        + " " + response.body().get(i).getPrinter());
                    }
            }

            @Override
            public void onFailure(Call<ArrayList<User>> call, Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });
    }
}
