
class MultiplicationTableThread extends Thread {
    private int number;  

    public MultiplicationTableThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is starting.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has finished.");
    }
}

public class ThreadLife {
    public static void main(String[] args) {
        MultiplicationTableThread tableFor5 = new MultiplicationTableThread(5);
        MultiplicationTableThread tableFor10 = new MultiplicationTableThread(10);
        System.out.println("Thread for 5 is in NEW state: " + tableFor5.getState());
        System.out.println("Thread for 10 is in NEW state: " + tableFor10.getState());
        tableFor5.start();
        tableFor10.start();
        System.out.println("Thread for 5 is in RUNNABLE state: " + tableFor5.getState());
        System.out.println("Thread for 10 is in RUNNABLE state: " + tableFor10.getState());

        try {
            tableFor5.join();
            tableFor10.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread for 5 is in TERMINATED state: " + tableFor5.getState());
        System.out.println("Thread for 10 is in TERMINATED state: " + tableFor10.getState());
    }
}
