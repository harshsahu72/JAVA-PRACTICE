package Sept17;

class Parent {

    void eat() {
        System.out.println("Parent eating");
    }

    void sleep() {
        System.out.println("Parent sleeping");
    }
}

class Child extends Parent {

    void eat() {
        System.out.println("Child eating");
    }


    void sleep() {
        System.out.println("Child sleeping");
    }

    void repeat() {
        System.out.println("Child repeating");
    }
}

public  class Sept17 {

    public static void main(String[] args) {

        Parent p = new Child();

        p.eat();
        p.sleep();

        Child c = new Child();
        c.repeat();
    }
}
