public class FactoryY implements SensorFactory {

    @Override
    public SensorForMotion createMotionSensor() {
        return new YMotionSensor();
    }

    @Override
    public SensorForSmoke createSmokeSensor() {
        return new YSmokeSensor();
    }
}