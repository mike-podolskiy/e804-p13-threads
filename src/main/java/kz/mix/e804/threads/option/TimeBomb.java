//CHECKSTYLE:OFF
package kz.mix.e804.threads.option;

public class TimeBomb extends Thread {

    String[] timeStr = {"Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One", "Zero"};

    public void run() {
        for (String str : timeStr) {
            try {
                System.out.println(str);
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TimeBomb timer = new TimeBomb();
        System.out.println("Starting 10 seconds count down...");

        timer.start();
        try {
            timer.join();
        }
        catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Boom!!!");
    }
}
