public class SmokeSmsAdapter implements Sms {
    private SmokeSms adaptee;

    public SmokeSmsAdapter(SmokeSms smokesms){
        this.adaptee = smokesms;
    }

    @Override
    public void sendMessage(String s){
        System.out.println("SMS dari ADAPTOR ASAP: " +s);
    }
}
