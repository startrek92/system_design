public class RunObserverDesignPattern {
    public static void main(String[] args) {

        EmailNotifierImpl emailNotifier = new EmailNotifierImpl("abc@gmail.com");
        MobileNotifierImpl mobileNotifier = new MobileNotifierImpl("X123DEF");

        IphonePublisherImpl iphonePublisher = new IphonePublisherImpl();
        iphonePublisher.add(emailNotifier);
        iphonePublisher.add(mobileNotifier);
        iphonePublisher.setData("iphoneIsBack");
    }
}
