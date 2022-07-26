public class XMotionSensor implements SensorForMotion, SensorListener {

    static final String DESCRIPTION = "Ini adalah Sensor Gerak buatan PabrikX.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new MotionSmsAdapter(new MotionSms());

        System.out.println("Sensor Gerak - Dibuat oleh Pabrik X");
        sms.sendMessage("Gerakan terdeteksi");

        AlarmForMotion alarm = new AlarmForMotion();
        StartAlarmCommand start = new StartAlarmCommand(alarm);
        start.execute();

        SingleObject logFile = SingleObject.getInstance();
        logFile.showMessage("file log: MOTION");
    }
}