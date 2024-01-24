package com.example.ourfinalproject;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.*;
public interface ApiService {


        @GET("feedback")
        Call<List<Doctor>> getFeedback();

        @POST("/add_feedback")
        Call<Void> addFeedback(@Query("doctorname") String courseName, @Query("feedback") String feedback);

        @POST("/search-doctor")
        Call<List<Doctor>> searchdoctor(@Body String query);
    }
