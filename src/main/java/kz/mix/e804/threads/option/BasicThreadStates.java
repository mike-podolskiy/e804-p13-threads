//CHECKSTYLE:OFF
package kz.mix.e804.threads.option;

public class BasicThreadStates {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread();
        System.out.println("Just after creating thread; \n" +
                        "       The thread state is: " + t.getState());
        t.start();
        System.out.println("Just after calling t.start(); \n" +
                "       The thread state is: " + t.getState());
        t.join();
        System.out.println("Just after main calling t.join(); \n" +
                "       The thread state is: " + t.getState());

    }
}
