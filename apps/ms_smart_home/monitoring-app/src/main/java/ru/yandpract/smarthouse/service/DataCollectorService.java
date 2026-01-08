package ru.yandpract.smarthouse.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandpract.smarthouse.db.entities.TelemetryReadingEntity;
import ru.yandpract.smarthouse.db.repositories.TelemetryReadingRepository;
import ru.yandpract.smarthouse.dtos.TelemetryReadingDto;
import ru.yandpract.smarthouse.service.mappers.TelemetryMapper;
import ru.yandpract.smarthouse.service.utils.UUIDGeneratorUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DataCollectorService {

    private final TelemetryReadingRepository telemetryReadingRepository;

    private final TelemetryClient telemetryClient;

    private final TelemetryMapper telemetryMapper;

    @Scheduled(fixedDelay = 5000)
    @Transactional
    public void loadTelemetry() {

        TelemetryReadingDto dto = telemetryClient.getData();

        TelemetryReadingEntity entity = new TelemetryReadingEntity();

        entity.setReadingId(UUIDGeneratorUtil.generateV7());

        entity.setTemperature(dto.getValue());
        entity.setHumidity(BigDecimal.ZERO);
        entity.setReceivedAt(LocalDateTime.now());
        entity.setRecordedAt(LocalDateTime.now());
        entity.setUnit(dto.getUnit());

        telemetryReadingRepository.save(entity);
    }
}
