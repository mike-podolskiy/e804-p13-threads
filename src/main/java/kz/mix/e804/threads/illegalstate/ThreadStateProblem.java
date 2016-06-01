//CHECKSTYLE:OFF
package kz.mix.e804.threads.illegalstate;

// This program throws Illegal
public class ThreadStateProblem extends Thread {
    @Override
    public void run() {
        try {
            wait(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t = new ThreadStateProblem();
        t.start();
        t.start();
    }
}
