class FibonacciRunnable implements Runnable {
    private int count; 
    public FibonacciRunnable(int count) {
        this.count = count;
    }
    @Override
    public void run() {
        int first = 0, second = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                System.out.print(first + " ");
            } else if (i == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
        System.out.println(); 
    }
}
public class FibinacciRun {
    public static void main(String[] args) {
        int n = 5; 
        FibonacciRunnable fibonacciTask = new FibonacciRunnable(n);
        Thread thread = new Thread(fibonacciTask);
        thread.start();
    }
}
