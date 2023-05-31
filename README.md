# sensor-readings-publisher
Simple Quarkus application which simulates temperature sensor readings.

The application produces a sensor reading message every 2 seconds and sends it to a Kafka topic.
Message format:
{
	"name": "sensor-1",
	"temperature": 25.15,
	"timestamp": "2023-05-05 08:15:00.000+0200"
}
