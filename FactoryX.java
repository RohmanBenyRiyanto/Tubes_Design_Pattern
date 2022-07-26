public class FactoryX implements SensorFactory {

    @Override
    public SensorForMotion createMotionSensor() {
        return new XMotionSensor();
    }

    @Override
    public SensorForSmoke createSmokeSensor() {
        return new XSmokeSensor();
    }
}