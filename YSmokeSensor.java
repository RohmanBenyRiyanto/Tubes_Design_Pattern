public class YSmokeSensor implements SensorForSmoke, SensorListener {

    static final String DESCRIPTION = "Ini adalah Sensor Asap buatan PabrikY.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new SmokeSmsAdapter(new SmokeSms());

        System.out.println("Sensor Asap - Dibuat oleh Pabrik Y");
        sms.sendMessage("ASAP terdeteksi");

        SprinklerForSmoke sprinkler = new SprinklerForSmoke();
        TurnOnSprinklerCommand turnon = new TurnOnSprinklerCommand(sprinkler);
        turnon.execute();

        SingleObject logFile = SingleObject.getInstance();
        logFile.showMessage("file log: ASAP");

    }
}