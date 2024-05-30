package section13_pattern.observer;

import java.util.List;

public interface PublisherInterface {

    List<Listener> getListeners();

    void addListener(Listener listener);

    void removeListener(Listener listener);

    void removeAllListener();

    void notifySubscriber(String message);

    void createMessage(String message);
}
