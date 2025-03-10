public interface Publisher {

    void add(Notifier notifier);

    void remove(Notifier notifier);

    void notifySubscribers();
}
