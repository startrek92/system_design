import java.util.ArrayList;
import java.util.List;

public class IphonePublisherImpl implements  Publisher {

    List<Observer> observerList;
    String message;
    String publisherEventName = "iphoneInStock";

    public IphonePublisherImpl() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : this.observerList) {
            observer.update(this.message, this.publisherEventName);
        }
    }

    public void setData(String message) {
        this.message = message;
        notifySubscribers();
    }

}
