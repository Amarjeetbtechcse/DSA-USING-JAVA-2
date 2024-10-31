public class Polymorphism_method_overloading{
    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println(calc.sum(1.8f,93.9f));
        System.out.println(calc.sum(1,93));
        System.out.println(calc.sum(25,88,99));
    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a + b +c;
    }
}