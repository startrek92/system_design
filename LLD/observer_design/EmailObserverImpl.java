public class EmailObserverImpl implements Observer {
    private final String email;

    public EmailObserverImpl(String email) {
        this.email = email;
    }

    @Override
    public void update(String message, String eventType) {
        System.out.printf("processing event %s%n", eventType);
        sendMail(eventType);
    }

    private void sendMail(String eventType) {
        System.out.printf("sending mail to %s for %s%n", this.email, eventType);
    }
}
