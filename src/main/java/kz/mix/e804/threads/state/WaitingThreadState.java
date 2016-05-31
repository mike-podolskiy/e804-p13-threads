//CHECKSTYLE:OFF
package kz.mix.e804.threads.state;

// This class has run method which waits forever since there is no other tread to notify it
class InfiniteWaitThread extends Thread {
    static boolean okayToRun = false;
    synchronized public void run() {
        while (!okayToRun) {
            try {
                // note the call to wait without any timeout value so it waits forever for some thread to notify it
                wait();
            } catch (InterruptedException ie) {
                // it's okay to ignore this exception since we're not interrupting exceptions in this code
                ie.printStackTrace();
            }
        }
    }
}

public class WaitingThreadState {
    public static void main(String[] args) {
        Thread t = new InfiniteWaitThread();
        t.start();
        System.out.println(t.getName() + ": I'm in state " + t.getState());
    }
}
