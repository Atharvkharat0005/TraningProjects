

public class Account {

    int accNum;
    String HolderName;
    double balance = 0;

    Account(int accNum, String HolderName, double balance) {
        
        this.accNum = accNum;
        this.HolderName = HolderName;
        this.balance = balance;

    }    

    void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    void display() {

        System.out.println("Enter you acc num: " + accNum);
        System.out.println("Account Holder Name: " +HolderName );
        System.out.println("Your account balance is: " + balance);

    }

}

class SavingAccount extends Account {

    int InteresetRate;

    // Explicit constructor to call super since Account has no default constructor
    SavingAccount(int accNum, String HolderName, double balance, int InteresetRate) {
        super(accNum, HolderName, balance);

     if (InteresetRate < 0) {
        System.err.println("Enter rate can not be O");
         
     }
else{  


        this.InteresetRate = InteresetRate;
}

    }

    void CalculateInterest() {
        // use the inherited balance
        double rate = 5.0;
        double years = 2.0;

        double interest = (this.balance * rate * years) / 100;

        // add interest to balance
        this.balance = this.balance + interest;
    }

}

class CurrentAccount extends Account {

    double overDraftLimit = 500.0;

    CurrentAccount(int accNum, String HolderName, double balance, double overDraftLimit) {
        super(accNum, HolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    void canWthdraw() {

        if (balance <= 0) {
            System.out.println("Insufficient balance");
        } else {
            return;
        }

    }

    boolean canWithdraw(double amount) {
        return amount <= (balance + overDraftLimit);
    }

}


class AccountMain {
    public static void main(String[] args) {


    // System.out.println(deposit());



        Account arr[] = {
                new SavingAccount(101, "Rahul", 10000, 5),
                new CurrentAccount(102, "Amit", 15000, 5000),
                new SavingAccount(103, "Priya", 20000, 4),
                new CurrentAccount(104, "Neha", 12000, 3000)
        };

        double totalBalance = 0;
        double maxBalance = arr[0].balance;
        double minBalance = arr[0].balance;

        int totalSaving = 0;
        int totalCurrent = 0;

        for (Account acc : arr) {

            totalBalance += acc.balance;

            if (acc.balance > maxBalance)
                maxBalance = acc.balance;

            if (acc.balance < minBalance)
                minBalance = acc.balance;

            if (acc instanceof SavingAccount)
                totalSaving++;

            if (acc instanceof CurrentAccount)
                totalCurrent++;
        }

        System.out.println("===== ACCOUNT DETAILS =====");

        for (Account acc : arr) {
            acc.display();
        }

        System.out.println("===== REPORT =====");
        System.out.println("Total Balance = " + totalBalance);
        System.out.println("Maximum Balance = " + maxBalance);
        System.out.println("Minimum Balance = " + minBalance);
        System.out.println("Total Saving Accounts = " + totalSaving);
        System.out.println("Total Current Accounts = " + totalCurrent);

        System.out.println("\n===== EDGE CASE TESTING =====");

        // Negative deposit
        arr[0].deposit(10000);

        // Saving account withdraw more than balance
        arr[0].withdraw(500);

        // Current account overdraft test
        arr[1].withdraw(500); 
    }
}






// String[] arr = {"Saving", "current", "saving", "current"};

//   Account account = new Account();
//         account.deposit(1000);
//         System.out.println(account.balance);

//         account.withdraw(1000);
//         System.out.println(account.balance);

//         SavingAccount rate = new SavingAccount();
//         rate.CalculateInterest();
//         System.out.println("The interest rate is: " + rate.balance);

//         currentAccount curr = new currentAccount();
//         curr.canWthdraw();