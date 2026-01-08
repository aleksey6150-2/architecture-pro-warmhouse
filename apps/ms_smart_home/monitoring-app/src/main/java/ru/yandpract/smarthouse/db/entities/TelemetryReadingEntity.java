package ru.yandpract.smarthouse.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "temperature_readings")
public class TelemetryReadingEntity {

    @Id
    @Column(name = "reading_id")
    private UUID readingId;

    @Column(name = "device_id")
    private UUID deviceId;

    @Column(name = "home_id")
    private UUID homeId;

    @Column(name = "room_id")
    private UUID roomId;

    private BigDecimal temperature;

    private String unit;

    private BigDecimal humidity;

    @Column(name = "recorded_at")
    private LocalDateTime recordedAt;

    @Column(name = "received_at")
    private LocalDateTime receivedAt;

}
