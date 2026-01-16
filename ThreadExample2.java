class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running via Runnable");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
