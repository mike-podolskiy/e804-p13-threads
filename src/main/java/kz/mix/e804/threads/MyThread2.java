//CHECKSTYLE:OFF
package kz.mix.e804.threads;

public class MyThread2 implements Runnable {
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }
}
