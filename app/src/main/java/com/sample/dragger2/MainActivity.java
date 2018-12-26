package com.sample.dragger2;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.sample.dragger2.Model.Result;
import com.sample.dragger2.Retrofit.APIService;

import org.w3c.dom.Text;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    Retrofit retrofit;

    @Inject
    Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication())
                .getComponent()
                .inject(this);

        APIService apiService = retrofit.create(APIService.class);
        Call<Result> call = apiService.getUsers("get");
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result>call, Response<Result> response) {

                Toast.makeText(MainActivity.this, response.body().getHeaders().getHost(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Result>call, Throwable t) {
            }
        });
    }
}