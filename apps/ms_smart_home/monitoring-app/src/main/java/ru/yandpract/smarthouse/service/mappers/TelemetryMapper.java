package ru.yandpract.smarthouse.service.mappers;

import org.mapstruct.Mapper;
import ru.yandpract.smarthouse.db.entities.TelemetryReadingEntity;
import ru.yandpract.smarthouse.dtos.TelemetryReadingDto;

@Mapper(componentModel = "spring")
public abstract class TelemetryMapper {

    public abstract TelemetryReadingEntity copy(TelemetryReadingDto telemetryReadingDto);
}
