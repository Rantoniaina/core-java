public class BankAccount {

    static String bankName = "Bank Of America";
    String accountHoldersName;
    String accountNumber;
    float balance;

    public static void main(String[] args) {
        double loanInterestRate = 7.5;
        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHoldersName = "John";
        bankAccount.accountNumber = "123456789";
        bankAccount.balance = 2000f;
        System.out.println(bankAccount.balance);
    }
}
