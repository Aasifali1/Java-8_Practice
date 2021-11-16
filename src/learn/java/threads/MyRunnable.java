package learn.java.threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello from child thread");
        }
    }
}
class DemoThread {
    public static void main(String[] args)
    {
        MyRunnable mr=new MyRunnable();
        Thread t= new Thread(mr);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("Hello from parent thread");
        }
    }

}
