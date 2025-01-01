package com.rasysbox.ws.application.dto;

import java.io.IOException;
import java.util.Map;

public interface AircraftService {
    Map<String, Object> fetchAircraftTypes() throws IOException;

    Map<String, Object> fetchAirports() throws IOException;
}
