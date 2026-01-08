package ru.yandpract.smarthouse.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import ru.yandpract.smarthouse.dtos.TelemetryReadingDto;

@Component
public class TelemetryClient {

    private final RestClient restClient;

    public TelemetryClient(@Value("${telemetry.sensor.url}") String telemetryUrl,
                           RestClient.Builder builder) {
        this.restClient = builder.baseUrl(telemetryUrl).build();
    }

    public TelemetryReadingDto getData() {

        return this.restClient.get()
                .uri("/temperature")
                .retrieve()
                .body(TelemetryReadingDto.class);

    }
}
