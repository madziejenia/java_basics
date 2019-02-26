package bank;

public class User {


    private BankAccount[] bankAccounts;
    private int accountLength = 0;
    private String name;


    public User(int numberOfAccounts) {                              // default constructor
        this.bankAccounts = new BankAccount[numberOfAccounts];      // create an array with number of accounts
        // application may assign bank account to a user, create a BankApp
        // with method
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount) {
        if (accountLength == 5) {
            return;                                                 // skonczy na 5 dlatego uzywamy to return, bo user ma 5 bank accounts
        }
        bankAccounts[accountLength] = bankAccount;
        accountLength++;

    }

    public void printUserInfo() {
        System.out.println("Name: " + this.name);
        for(int i = 0; i < accountLength; i++){
            BankAccount a = bankAccounts[i];
            System.out.println("account: " + a.getBalance());
        }
    }
}

