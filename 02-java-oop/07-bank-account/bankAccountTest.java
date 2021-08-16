public class bankAccountTest{
    public static void main(String[] args){

        bankAccount account = new bankAccount();
        
        System.out.println("Account number is: " + account.getAccountNum());
        account.getCheckingBalance();
        account.getSavingBalance();
        account.depositChecking(200);
        account.depositSaving(4000);
        account.withdrawalChecking(100);

        System.out.println(account.getCheckingBalance());
        account.withdrawalSaving(2000);
        System.out.println(account.getSavingBalance());
        account.total();

        System.out.println("Total in checking and savings account is: $" + account.total());
        
    }
}