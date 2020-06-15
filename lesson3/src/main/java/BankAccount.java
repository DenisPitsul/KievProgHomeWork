import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;

    public BankAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() { }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
        System.out.println("Your balance: " + this.balance);
    }

    public void credit(BigDecimal money) {
        this.balance = this.balance.add(money);
        System.out.println("Your balance has increased by " + money);
        System.out.println("Your balance: " + this.balance);
    }

    public void debit(BigDecimal money) {
        if (balance.compareTo(money) < 0) {
            System.out.println("The withdrawal amount is more than the account balance!");
            return;
        }
        this.balance = this.balance.subtract(money);
        System.out.println("Your balance has decreased by " + money);
        System.out.println("Your balance: " + this.balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber &&
                balance.equals(that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "BackAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
