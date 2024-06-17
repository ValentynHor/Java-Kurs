package section9_interview.thread;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing...");
                try {
                    Thread.sleep(100); // Kurze Pause
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 executing...");
                try {
                    Thread.sleep(100); // Kurze Pause
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY); // Setze niedrigere Priorität (1)
        thread2.setPriority(Thread.MAX_PRIORITY); // Setze höhere Priorität (10)
        
        thread1.start();
        thread2.start();
    }
}
