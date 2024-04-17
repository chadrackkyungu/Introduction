package QUESTION2;

public class TaskDisplayApp {
    public static void main(String[] args) {
        Task task = new Task("Coding", 101, 1500);

        // Thread to display basic task details
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000); // Pause for 1000ms
                System.out.println(Thread.currentThread().getName() + " - " + task.toString());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted: " + Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
        }, "Thread-Basic");

        // Thread to display detailed task details
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000); // Pause for 1000ms
                System.out.println(Thread.currentThread().getName() + " - " + task.detailedString());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted: " + Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
        }, "Thread-Detailed");

        thread1.start();
        thread2.start();

        // Optionally join threads to ensure main waits for them to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted during join.");
        }

        // Display final states (should be TERMINATED)
        System.out.println(thread1.getName() + " final State: " + thread1.getState());
        System.out.println(thread2.getName() + " final State: " + thread2.getState());
    }
}
