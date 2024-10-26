public class Constructors {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020); // Constructor call
        myCar.display();
    }
}

class Car {
    String model;
    int year;

    // Constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
