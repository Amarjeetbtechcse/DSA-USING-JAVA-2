public class Abstract_abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);

        Mustang m = new Mustang();
    }
}
abstract class Animal {

    String color;

    Animal() {
    System.out.println("animal constructor called.");

        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("horse constructor called.");
    }
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}
//Mustang is any breed of horse
class Mustang extends Horse {
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
