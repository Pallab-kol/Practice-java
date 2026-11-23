package Threading;
//using Threads class to create thread
class MyThread1 extends Thread{
    public void run(){      //innate method
        System.out.println("Thread 1 is running...");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running...");
    }
}
public class Thread1 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();     //running the threads seperately innate method
        m2.start();
    }
}
