public class StopAlarmCommand implements Command{
    AlarmForMotion alarm;

    public StopAlarmCommand(AlarmForMotion alarm) {
        super();
        this.alarm = alarm;
    }

    public void execute() {
        System.out.println("Menghentikan Alarm.");
        alarm.stop();
    }
}