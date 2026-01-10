package ru.yandpract.smarthouse.service.utils;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class UUIDGeneratorUtil {

    public static UUID generateV7() {
        return Generators.timeBasedEpochGenerator().generate();
    }
}
