public class Super_keyword {
    public static void main(String[] args) {
       Horse h = new Horse(); 
        System.out.println(h.color);
    }
}

class Animals {
    String color;
    Animals(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animals{
    Horse(){
        super();
        super.color = "reddish brown";
        System.out.println("horse constructor is called");
    }
}
