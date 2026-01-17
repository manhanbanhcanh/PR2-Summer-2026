package TUT2.BankAccount;

public class BankAccount {
    double balance;
    int transactions;

    String holderName;

    public BankAccount(double initial, String holderName) {
        this.holderName = holderName;
        this.balance = initial;
        this.transactions = 1;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest(double interestRate){
        this.balance += balance * interestRate;
    }

    public void transfer(double amount){
        double totalCost = amount + 0.5;
        if ((balance - totalCost) < 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= totalCost;
        }
    }

    @Override //not necessary, but it is not a bad practice in my opinion
    public String toString(){
        if (balance < 0){
            return (holderName + ", -$" + Math.abs(balance));
        } else {
            return (holderName + ", $" + balance);
        }
    }

}