public class MobileObserverImpl implements Observer {

    private final String mobileId;

    public MobileObserverImpl(String mobileId) {
        this.mobileId = mobileId;
    }

    @Override
    public void update(String message, String eventType) {
        sendMobileMessage(eventType);
    }

    private void sendMobileMessage(String eventType) {
        System.out.printf("processing mobile event %s%n", eventType);
        System.out.printf("sending message to %s for event %s%n", this.mobileId, eventType);
    }
}
