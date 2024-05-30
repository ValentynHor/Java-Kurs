package section13_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublisherInterface {

    private List<Listener> listeners = new ArrayList<>();

    @Override
    public List<Listener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListener() {
        listeners.clear();
    }

    @Override
    public void notifySubscriber(String message) {
        for(Listener l : listeners){
            l.doAction(message);
        }
    }

    @Override
    public void createMessage(String message) {
        System.out.println("Publisher print: " + message);
        notifySubscriber(message);
    }
}
