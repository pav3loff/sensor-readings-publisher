package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class SensorReadingsProducerTest {

    @Inject
    SensorReadingsProducer application;

    @Test
    void test() {
    }

}
