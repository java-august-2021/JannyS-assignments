import java.util.Random;

public class bankAccount {
    private String accountNum;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    private static int accountsCreated = 0;
    private static double totalAmount = 0;
public bankAccount() {
    createAccountNum();
    }
public String getAccountNum(){
    return accountNum;
    }
private String createAccountNum(){
    String numbers = "1234567890";
    String newAccountNum = "";

    Random random = new Random();

    for (int i = 0; i < 5; i++){
        int num = numbers.charAt(random.nextInt(10));
        newAccountNum += num;
        }

    accountNum = newAccountNum;
    return newAccountNum;
    }
public int createAccount(){
    return accountsCreated++;
}
public void setCheckingBalance(double checkingBalance){
    this.checkingBalance = checkingBalance;
    }
public double getCheckingBalance(){
    System.out.println("Checking balance is: $" + this.checkingBalance);
    return this.checkingBalance;
    }
public void setSavingBalance(double savingBalance){
    this.savingBalance = savingBalance;
    }
public double getSavingBalance(){
    System.out.println("Savings balance is: $" + this.savingBalance);
    return this.savingBalance;
    
    }
public void depositChecking(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    totalAmount += checkingBalance;
    }
public void depositSaving(double savingBalance){
    this.setSavingBalance(savingBalance);
    totalAmount += savingBalance;
    }
public double total(){
    totalAmount = savingsBalance + checkingBalance;
    return totalAmount;
    }
public void withdrawalChecking(int amount){
    if (getCheckingBalance() < Double.valueOf(amount)){
        System.out.println("Insufficient funds in checking");
    } 
    else{
        setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));
    
        }
    }
public void withdrawalSaving(int amount){
    if (getSavingBalance() < Double.valueOf(amount)){
        System.out.println("Insufficient funds in savings");
    } 
    else{
        this.setSavingBalance(this.getSavingBalance() - Double.valueOf(amount));
        }
    }
}
