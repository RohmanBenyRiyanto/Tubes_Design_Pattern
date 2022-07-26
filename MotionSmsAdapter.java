public class MotionSmsAdapter implements Sms {
    private MotionSms adaptee;

    public MotionSmsAdapter(MotionSms motionsms){
        this.adaptee = motionsms;
    }

    @Override
    public void sendMessage(String s){
        System.out.println("SMS dari MOTION ADAPTER: " +s);
    }
}
