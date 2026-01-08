package ru.yandpract.smarthouse.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TelemetryReadingDto {

    private int id;

    private String name;

    private String type;

    private String location;

    private BigDecimal value;

    private String unit;

    private String status;

    private LocalDateTime last_updated;

    private LocalDateTime created_at;
}
