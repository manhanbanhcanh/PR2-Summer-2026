package TUT2.BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        //create bank accounts (AI generated name btw)
        BankAccount account1 = new BankAccount(1000.0, "Alice Johnson");
        BankAccount account2 = new BankAccount(500.0, "Bob Smith");
        BankAccount account3 = new BankAccount(100.0, "Charlie Brown");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println();

        //demonstrate deposit
        System.out.println("Alice deposits $250");
        account1.deposit(250.0);
        System.out.println(account1);
        System.out.println("Transactions: " + account1.transactions);
        System.out.println();

        //demonstrate withdrawal
        System.out.println("Bob withdraws $100");
        account2.withdraw(100.0);
        System.out.println(account2);
        System.out.println("Transactions: " + account2.transactions);
        System.out.println();

        //demonstrate transfer (successful)
        System.out.println("Alice transfers $200 (fee: $0.50)");
        System.out.println("Before: " + account1);
        account1.transfer(200.0);
        System.out.println("After: " + account1);
        System.out.println();

        //demonstrate transfer (insufficient funds)
        System.out.println("Charlie tries to transfer $150 (fee: $0.50)");
        System.out.println("Before: " + account3);
        account3.transfer(150.0);
        System.out.println("After: " + account3);
        System.out.println();

        //demonstrate monthly fee
        System.out.println("Applying $10 monthly fee to all accounts");
        account1.monthlyFee();
        account2.monthlyFee();
        account3.monthlyFee();
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println();

        //demonstrate annual interest
        System.out.println("Applying 5% annual interest to all accounts");
        account1.annualInterest(0.05);
        account2.annualInterest(0.05);
        account3.annualInterest(0.05);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println();

        //demonstrate negative balance (overdraft scenario)
        System.out.println("Charlie withdraws $200 (creating overdraft)");
        account3.withdraw(200.0);
        System.out.println(account3);
        System.out.println();

        //show transaction counts
        System.out.println(account1.holderName + " - Total transactions: " + account1.transactions);
        System.out.println(account2.holderName + " - Total transactions: " + account2.transactions);
        System.out.println(account3.holderName + " - Total transactions: " + account3.transactions);
        System.out.println();

        //comprehensive scenario (the \n helps me from typing another System.out.println(); line)
        System.out.println("Comprehensive monthly scenario");

        BankAccount savings = new BankAccount(5000.0, "Diana Prince");
        System.out.println("Starting balance: " + savings);

        System.out.println("\nWeek 1:");
        savings.deposit(500.0);
        System.out.println("  Deposit $500: " + savings);
        savings.withdraw(150.0);
        System.out.println("  Withdraw $150: " + savings);

        System.out.println("\nWeek 2:");
        savings.transfer(300.0);
        System.out.println("  Transfer $300: " + savings);
        savings.deposit(1000.0);
        System.out.println("  Deposit $1000: " + savings);

        System.out.println("\nWeek 3:");
        savings.withdraw(200.0);
        System.out.println("  Withdraw $200: " + savings);

        System.out.println("\nWeek 4:");
        savings.transfer(500.0);
        System.out.println("  Transfer $500: " + savings);

        System.out.println("\nEnd of Month:");
        savings.monthlyFee();
        System.out.println("  Monthly fee applied: " + savings);

        System.out.println("\nEnd of Year:");
        savings.annualInterest(0.03);
        System.out.println("  3% interest applied: " + savings);

        System.out.println("\nFinal transactions count: " + savings.transactions);
    }
}