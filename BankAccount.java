public class BankAccount
{ 
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }chrome

    public boolean withdraw (double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
         else
             {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }
    
    public boolean transfer(BankAccount B, double amount)
    {
        if (withdraw(amount)) {
            B.deposit(amount);
            return true;
        } 
        else
        {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountDemo {
    public static void main(String args[]) {
        BankAccount b1 = new BankAccount("Ram", "123", 10000);
        BankAccount b2 = new BankAccount("Shyam", "456", 500);
        b1.withdraw(1000);
        b1.display();
        b1.deposit(500);
        b1.display();

        boolean s = b1.transfer(b2, 1000);
        if(s == true) {
            System.out.println("Transfer successful");
            b1.display();
            b2.display();
        }
        else {
            System.out.println("Transfer failed");
            b1.display();
            b2.display();
        }

        s = b1.transfer(b2, 10000);
        if(s == true) {
            System.out.println("Transfer successful");
            b1.display();
            b2.display();
        }
        else {
            System.out.println("Transfer failed");
            b1.display();
            b2.display();
        }
    }
}