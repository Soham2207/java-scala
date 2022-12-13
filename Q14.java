import java.util.*;

class Account {
    String name;
    String branch;
    private double bal = 0;

    Account(String n , String br , Double b){
        name = n;
        branch=br;
        bal = b;
    }

    public double getBalance(){
        return bal;
    }

    public void updateBalance(double b){
        System.out.println("For Customer , " + name + " \nUpdated balance is : " + b);
        bal=b;
    }
}

class SavingsAccount extends Account{
    static final int interest = 10;

    SavingsAccount(String n, String br, Double b) {
        super(n, br, b);
    }

    public void addInterest(){
        double b = getBalance();
        updateBalance(b+b*interest/100);
    }

}

class CurrentAccount extends Account{
    static final int ODLIMIT = 10000;
    int w_amt = 0;
    CurrentAccount(String n, String br, Double b , int withdrawal_amt) {
        super(n, br, b);
        w_amt = withdrawal_amt;
    }

    public void withdraw(){
        if(w_amt>ODLIMIT && w_amt>=getBalance()){
            System.out.println("aukaat me rahoooo");
        }else{
            updateBalance(getBalance() - w_amt);
        }
    }

}

class Bank {
    List<Object> accounts = new ArrayList<Object>();
    Bank(List<Object> arr){
        accounts.addAll(arr);
    }

    public void browse(){
        for(Object acc : accounts){
            if(acc instanceof SavingsAccount){
                ((SavingsAccount) acc).addInterest();
            }else{
                ((CurrentAccount) acc).withdraw();
            }
        }
    }
}

class Q14 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("A", "x", 5000.0);
        CurrentAccount c = new CurrentAccount("B", "y", 10000.0, 11000);
        List<Object> a = new ArrayList<Object>();
        a.add(s);
        a.add(c);
        Bank b = new Bank(a);
        b.browse();
    }
}