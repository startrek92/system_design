public class RunObserverDesignPattern {
    public static void main(String[] args) {

        EmailObserverImpl emailNotifier = new EmailObserverImpl("abc@gmail.com");
        MobileObserverImpl mobileNotifier = new MobileObserverImpl("X123DEF");

        IphonePublisherImpl iphonePublisher = new IphonePublisherImpl();
        iphonePublisher.add(emailNotifier);
        iphonePublisher.add(mobileNotifier);
        iphonePublisher.setData("iphoneIsBack");
    }
}
