public interface Publisher {
    void add(Observer observer);

    void remove(Observer observer);

    void notifySubscribers();
}

// TODO add handling, so that observer will only get notified
//  if it subscribed before state change

// lets observer a decided to subscribe & then just after the change
// a new observer b is added, in this b should not be notified as
// it subscribed after state was changed
