package bank;

public class BankApplication {
    public static void main(String[] args) {
        User user = new User(5);
        user.setName("Paul");

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(150);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.deposit(100);

        user.addBankAccount (bankAccount);                              // przypisujemy usera do bank account
        user.addBankAccount (bankAccount2);

        user.printUserInfo();

        transfer(bankAccount, bankAccount2, 75);

        user.printUserInfo();
    }

    public static void transfer(BankAccount from, BankAccount to, double value){
        from.withdraw(value);
        to.deposit(value);
    }
}

