package QUESTION2;

public class TaskDisplayApp {
    public static void main(String[] args) {
        final Task task = new Task("Coding", 101, 1500);

        Runnable taskInfoPrinter = () -> {
            try {
                Thread.sleep(1000); // Simulate delay
                System.out.println(Thread.currentThread().getName() + " - " + task.toString());
            } catch (InterruptedException e) {
                System.err.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
                Thread.currentThread().interrupt(); // Set the interrupt flag
            }
            printThreadDetails();
        };

        Runnable detailedTaskInfoPrinter = () -> {
            try {
                Thread.sleep(1000); // Simulate delay
                System.out.println(Thread.currentThread().getName() + " - " + task.detailedString());
            } catch (InterruptedException e) {
                System.err.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
                Thread.currentThread().interrupt(); // Set the interrupt flag
            }
            printThreadDetails();
        };

        Thread thread1 = new Thread(taskInfoPrinter, "Thread-Basic");
        Thread thread2 = new Thread(detailedTaskInfoPrinter, "Thread-Detailed");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted.");
        }

        System.out.println(thread1.getName() + " final State: " + thread1.getState());
        System.out.println(thread2.getName() + " final State: " + thread2.getState());
    }

    private static void printThreadDetails() {
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
    }
}
