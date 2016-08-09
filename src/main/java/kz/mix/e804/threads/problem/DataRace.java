//CHECKSTYLE:OFF
package kz.mix.e804.threads.problem;

// This class exposes a publicly accessible counter
// to help demonstrate data race problem
class Counter {
    public static long count = 0;
}

// This class implements Runnable interface
// Its run method increments the counter three times
class UseCounter implements Runnable {
    public void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(Counter.count + "  ");
    }

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }
}

// This class created three threads
public class DataRace {
    public static void main(String[] args) {
        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
    }
}
