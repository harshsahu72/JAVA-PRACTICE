
package shoppingmall30oct;

class Billing extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Generating Bill: " + i);
        }
    }
}

class Packing extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Packing Item: " + i);
        }
    }
}

class Delivery extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Delivery Order: " + i);
        }
    }
}

public class shoppingmall30oct {
    public static void main(String[] args) {

        Billing t1 = new Billing();
        Packing t2 = new Packing();
        Delivery t3 = new Delivery();

        t1.start();
        t2.start();
        t3.start();
    }
}