package ru.yandpract.smarthouse.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SensorResponse {

    private int id;

    private String name;

    private String type;
    private String location;
    private Float value;
    private String unit;
    private String status;

    private LocalDateTime last_updated;

    private LocalDateTime created_at;

}
