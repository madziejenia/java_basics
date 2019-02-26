package bank;

public class BankAccount {

    private double balance;

    public void deposit (double deposit){
        balance += deposit;                 // += to to samo co balnce + deposit
    }

    public void withdraw (double value){
       // balance = balance - value;
        balance -= value;
    }

    public double getBalance(){
        return balance;
    }
}


