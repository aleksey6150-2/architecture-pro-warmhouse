package ru.yandpract.smarthouse.service;

import org.springframework.stereotype.Service;
import ru.yandpract.smarthouse.dtos.SensorResponse;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class SensorService {

    private final RandomGenerator generator = RandomGenerator.getDefault();

    public SensorResponse getTemperature(String location) {
        float min = -10.0f;
        float max = 30.0f;

        float randomFloat = min + generator.nextFloat() * (max - min);
        return new SensorResponse(
                1, "Test sensor", "temp sensor", location, randomFloat, "celcius", "active",
                LocalDateTime.now(),
                LocalDateTime.of(2026, 1, 1, 1, 1)
        );
    }
}
