//CHECKSTYLE:OFF
package kz.mix.e804.threads.option;

public class SimpleThread2 {
    public static void main(String []s) {
        Thread t = new Thread();

        t.setName("SimpleThread");
        t.setPriority(9);

        System.out.println(t);
    }
}
