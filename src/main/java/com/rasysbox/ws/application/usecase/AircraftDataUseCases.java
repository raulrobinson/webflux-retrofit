package com.rasysbox.ws.application.usecase;

import com.rasysbox.ws.application.dto.AircraftService;
import com.rasysbox.ws.infrastructure.service.AircraftServiceClient;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;

@Component
public class AircraftDataUseCases implements AircraftService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AircraftDataUseCases.class);
    private final AircraftServiceClient aircraftServiceClient;

    @Autowired
    public AircraftDataUseCases(AircraftServiceClient aircraftServiceClient) {
        this.aircraftServiceClient = aircraftServiceClient;
    }

    @Override
    public Map<String, Object> fetchAircraftTypes() throws IOException {
        Call<Map<String, Object>> call = aircraftServiceClient.getAircraftTypes();
        Response<Map<String, Object>> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            log.info("Aircraft types fetched successfully");
            return response.body();
        } else {
            log.error("Error fetching aircraft types");
            throw new IOException("Failed to fetch aircraft data: " + response.errorBody());
        }
    }

    @Override
    public Map<String, Object> fetchAirports() throws IOException {
        Call<Map<String, Object>> call = aircraftServiceClient.getAirports();
        Response<Map<String, Object>> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            log.info("Airports fetched successfully");
            return response.body();
        } else {
            log.error("Error fetching airports");
            throw new IOException("Failed to fetch airport data: " + response.errorBody());
        }
    }

}

