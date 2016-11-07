package com.volkov.soct.client;

import com.volkov.soct.client.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;

/**
 * Created by WoLf on 07.11.2016.
 */
public interface ClientAPI {

    @GET("users.json")
    Call<ArrayList<User>> execSomeMethod();
}
