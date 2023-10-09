import java.math.BigDecimal;

interface Account {
    void deposite(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(Account toAccount, BigDecimal amount);
    int getAccountNumber();
    BigDecimal getBalance();
}
