package learn.java.lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        // first thread
        Runnable thread1 =()->{
            // body of thread
            for (int i=0; i<5; i++)
            {
                try {
                    System.out.println("Thread is running");
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t =new Thread(thread1);
        t.start();
    }
}
