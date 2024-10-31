public class Overriding_function {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}