package section9_interview.thread;

public class WaitNotifyExample {
    private final Object lock = new Object();
    private boolean condition = false;

    public void waitForCondition() {
        synchronized (lock) {
            while (!condition) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Condition met, proceeding...");
        }
    }

    public void setCondition() {
        synchronized (lock) {
            condition = true;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {
        WaitNotifyExample example = new WaitNotifyExample();

        Thread waiter = new Thread(example::waitForCondition);
        Thread notifier = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            example.setCondition();
        });

        waiter.start();
        notifier.start();
    }
}
