public class Bank {
    private double balance = 1000.50;

public static void main(String [] args){
    Bank std1 = new Bank();


    std1.accountDetails();

    std1.newBalance(10000);


      std1.withdraw(1000.0);

    std1.Tax();

  

}

public void accountDetails(){

String accountHolderName = "Atharv Kharat";
int accountNumber = 12345;
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Balance: " + balance);


}

public void newBalance(double amount){
    balance = balance + amount;
    System.out.println("New Balance after adding: " + balance);

}

public void withdraw(double amount){
  balance -= amount;
  System.out.println("New Balance after withdrawing: " + balance);

}
public void Tax(){

double tax = 0.07 * balance;   
System.out.println("Tax after withdrawing money: " + tax);


}



}
