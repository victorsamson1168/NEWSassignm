package com.samson.popularnews.api;

import com.samson.popularnews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //https://newsapi.org/v2/top-headlines?country=us&apiKey=a8299f4eb1584dbebcae7c6d2561da0b

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );



}
