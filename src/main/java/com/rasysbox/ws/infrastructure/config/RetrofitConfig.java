package com.rasysbox.ws.infrastructure.config;

import com.rasysbox.ws.infrastructure.service.AircraftServiceClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit(@Value("${globe.airplane.api.url}") String url) {
        return new Retrofit.Builder()
                .baseUrl(url)
                .client(new OkHttpClient())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    @Bean
    public AircraftServiceClient aircraftService(Retrofit retrofit) {
        return retrofit.create(AircraftServiceClient.class);
    }

}

