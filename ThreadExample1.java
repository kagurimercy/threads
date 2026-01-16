class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running via extends");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
