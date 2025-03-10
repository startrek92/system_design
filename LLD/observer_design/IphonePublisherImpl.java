import java.util.ArrayList;
import java.util.List;

public class IphonePublisherImpl implements  Publisher {

    List<Notifier> observerList;
    String message;
    String publisherEventName = "iphoneInStock";

    public IphonePublisherImpl() {
        this.observerList = new ArrayList<Notifier>();
    }

    @Override
    public void add(Notifier notifier) {
        observerList.add(notifier);
    }

    @Override
    public void remove(Notifier notifier) {
        observerList.remove(notifier);
    }

    @Override
    public void notifySubscribers() {
        for (Notifier notifier : this.observerList) {
            notifier.update(this.message, this.publisherEventName);
        }
    }

    public void setData(String message) {
        this.message = message;
        notifySubscribers();
    }

}
