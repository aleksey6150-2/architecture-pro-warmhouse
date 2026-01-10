package ru.yandpract.smarthouse.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yandpract.smarthouse.db.entities.TelemetryReadingEntity;

import java.util.UUID;

public interface TelemetryReadingRepository extends JpaRepository<TelemetryReadingEntity, UUID> {
}
