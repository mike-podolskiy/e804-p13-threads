//CHECKSTYLE:OFF
package kz.mix.e804.threads.common;

public class MyThread3 implements Runnable {
    public void run() {
        System.out.println("In run method; thread name is: " +
                Thread.currentThread().getName());
    }
    public static void main(String args[]) throws Exception {
        Thread myThread = new Thread(new MyThread3());
        myThread.run(); // note run() instead of start() here
        System.out.println("In main method; thread name is : " +
                Thread.currentThread().getName());
    }
}
