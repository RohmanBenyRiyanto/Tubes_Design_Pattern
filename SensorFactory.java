public interface SensorFactory {
    SensorForMotion createMotionSensor();
    SensorForSmoke createSmokeSensor();
}