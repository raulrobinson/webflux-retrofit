package com.rasysbox.ws.infrastructure.service;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.Map;

public interface AircraftServiceClient {

    @GET("/db-2/icao_aircraft_types2.js")
    Call<Map<String, Object>> getAircraftTypes();

    @GET("/db-2/airports.js")
    Call<Map<String, Object>> getAirports();

}
