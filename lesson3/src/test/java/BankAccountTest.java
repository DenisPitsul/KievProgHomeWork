import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BankAccountTest {
    private BankAccount bankAccount;

    @Before
    public void setUp() {
        bankAccount = new BankAccount(261298, new BigDecimal(5000));
    }

    @Test
    public void testSetAccountNumber() {
        bankAccount.setAccountNumber(887);
        Assert.assertEquals("If fail then method setAccountNumber is broken.",
                887, bankAccount.getAccountNumber());
    }

    @Test
    public void testSetBalance() {
        bankAccount.setBalance(new BigDecimal(7000));
        BigDecimal expectedBalance = new BigDecimal(7000);
        Assert.assertEquals("If fail then method setBalance is broken.",
                expectedBalance, bankAccount.getBalance());
    }

    @Test
    public void testIfSumOfMoneyWeDebitIsLessThanSumOfMoneyOnTheBalance() {
        bankAccount.debit(new BigDecimal(1200));
        BigDecimal expectedBalance = new BigDecimal(3800);
        Assert.assertEquals("If fail then method debit is broken.",
                expectedBalance, bankAccount.getBalance());
    }

    @Test
    public void testIfSumOfMoneyWeDebitIsMoreThanSumOfMoneyOnTheBalance() {
        bankAccount.debit(new BigDecimal(5500));
        BigDecimal expectedBalance = new BigDecimal(5000);
        Assert.assertEquals("If fail then method debit is broken.",
                expectedBalance, bankAccount.getBalance());
    }

    @Test
    public void testDebitAllMoneyFromTheBalance() {
        bankAccount.debit(bankAccount.getBalance());
        BigDecimal expectedBalance = new BigDecimal(0);
        Assert.assertEquals("If fail then method debit is broken.",
                expectedBalance, bankAccount.getBalance());
    }
}
