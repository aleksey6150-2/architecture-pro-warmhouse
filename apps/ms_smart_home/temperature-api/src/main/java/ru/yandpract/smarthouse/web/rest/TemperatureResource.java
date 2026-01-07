package ru.yandpract.smarthouse.web.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yandpract.smarthouse.dtos.SensorResponse;
import ru.yandpract.smarthouse.service.SensorService;

@RestController
@AllArgsConstructor
public class TemperatureResource {

    private final SensorService sensorService;

    @GetMapping(value = "/temperature")
    public SensorResponse getTemperature(@RequestParam(required = false) String location) {
        return sensorService.getTemperature(location);
    }


}
