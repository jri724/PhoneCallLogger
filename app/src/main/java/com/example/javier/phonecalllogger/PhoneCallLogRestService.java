package com.example.javier.phonecalllogger;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PhoneCallLogRestService {

    @POST("phone_call_log")
    Call<Void> add(@Body PhoneCall phoneCall);
}
