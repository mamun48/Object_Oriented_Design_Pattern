import java.math.BigDecimal;

public class Investment implements Account{
    private static int accountNumberCounter = 300;
    private int accountNumber;
    private BigDecimal balance;
    public Investment(BigDecimal initialAmount)
    {
        this.balance = initialAmount;
        this.accountNumber = ++accountNumberCounter;
    }
    @Override
    public void deposite(BigDecimal amount)
    {
        balance = balance.add(amount);
    }
    public void withdraw(BigDecimal amount)
    {
        if(balance.compareTo(amount) >= 0)
        {
            balance = balance.subtract(amount);
        }else
        {
            System.out.println("Insufficient balance in Savings account");
        }
    }
    public BigDecimal getBalance()
    {
        return balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public void transfer(Account toAccount, BigDecimal amount)
    {
        if(toAccount != null && toAccount != this)
        {
            if(balance.compareTo(amount) >= 0)
            {
                withdraw(amount);
                toAccount.deposite(amount);
                System.out.println("Transfered Successfully!");
            }else
            {
                System.out.println("Insufficient balance to transfer!");
            }
        }else
        {
            System.out.println("Invalid target account to transfer!");
        }
    }
}
