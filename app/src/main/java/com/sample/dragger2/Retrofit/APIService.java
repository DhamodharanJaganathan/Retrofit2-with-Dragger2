package com.sample.dragger2.Retrofit;

import com.sample.dragger2.Model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface APIService {
    @GET
    Call<Result> getUsers(@Url String url);
}