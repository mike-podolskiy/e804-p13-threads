//CHECKSTYLE:OFF
package kz.mix.e804.threads.state;

public class ThreadStatesEnumeration {
    public static void main(String[] args) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}