package org.acme;

public class SensorReadingMessage {

    private String name;
    private double temperature;
    private String timestamp;

    public SensorReadingMessage() {}

    public SensorReadingMessage(String name, double temperature, String timestamp) {
        this.name = name;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
