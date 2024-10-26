public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "amarjeet";
        myAcc.setPassword("abcdefghijklmnopqrsuvwxyz");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}