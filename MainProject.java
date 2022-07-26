public class MainProject{
    public static void main(String[] arg) {
        SingleObject logFile = SingleObject.getInstance();

        SensorFactory factory;
        factory = new FactoryX();

        AlarmForMotion alarm = new AlarmForMotion();
        SprinklerForSmoke sprinkler = new SprinklerForSmoke();

        SensorForSmoke smokesensor =  factory.createSmokeSensor();
        SensorForMotion motionsensor = factory.createMotionSensor();

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register((SensorListener) smokesensor);
        sensorSystem.register((SensorListener) motionsensor);
        sensorSystem.notifyUser();

        HomeSecurityRemote remote = new HomeSecurityRemote();
        remote.setCommand(new StopAlarmCommand( alarm ));
        remote.buttonPressed();

        remote.setCommand(new TurnOffSprinklerCommand(sprinkler));
        remote.buttonPressed();
    }
}