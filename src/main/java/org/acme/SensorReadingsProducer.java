package org.acme;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.reactive.messaging.*;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@ApplicationScoped
public class SensorReadingsProducer {

    private Random random = new Random();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSZ");

    @Outgoing("sensor-readings")
    public Multi<SensorReadingMessage> produce() {
        return Multi.createFrom().ticks().every(Duration.ofSeconds(2))
                .map(x -> {
                    SensorReadingMessage sensorReadingMessage = new SensorReadingMessage("sensor-" + (random.nextInt(6) + 1), random.nextDouble() + 25, LocalDateTime.now().atOffset(ZoneOffset.ofHours(2)).format(formatter));

                    System.out.println("Timestamp: " + sensorReadingMessage.getTimestamp());

                    return sensorReadingMessage;
                });
    }

}
