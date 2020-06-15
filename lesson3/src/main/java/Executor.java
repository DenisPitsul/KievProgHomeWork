import java.math.BigDecimal;

public class Executor {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(32, new BigDecimal(1200));
        bankAccount.debit(new BigDecimal(800));
        bankAccount.credit(new BigDecimal(300));
        bankAccount.debit(new BigDecimal(1000));
        bankAccount.setBalance(new BigDecimal(900));
        System.out.println(bankAccount);
    }
}
