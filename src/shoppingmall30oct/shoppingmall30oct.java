/* imagine a shopping mall where three employees are performing different tasks simultaeously.
you have to create a Java program using Multithreading to perform all three tasks at the same time.
requirements
Create threee seperate thread classes:
Thread Task Expected Output
Thread 1 - Billing Print billing numbers from 1 to 10 Generating Bill: 1
Thread 2 - Packing Print packing items from 1 to 10 Packing Item: 1
Thread 3 - Delivery Print delivery updates from 1 to 10 Delivery Order: 1

Instructionos
Create three seperate classes.
Each class must extend the Thread class.
Override the run() method in each class.
Use a for loop to print numbers from 1 to 10.
Create three thread objects inside the main() method.
Start all three threads using start().

*/



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