package com.hello.coworkspace.Rest;

import com.hello.coworkspace.Model.GetSpace;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("space")
    Call<GetSpace> GetSpace();
}
