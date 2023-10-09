import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, Account> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<Integer, Account>();
    }

    public int createNewAccount(String type, BigDecimal initAmount) {
        Account newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        Account toAccount = this.bankAccounts.get(to);
        Account fromAccount = this.bankAccounts.get(from);
        if (toAccount != null && fromAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("Invalid account numbers for transfer.");
        }
    }
    public BigDecimal getBalance(int accountNumber) {
        Account account = bankAccounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account with account number " + accountNumber + " does not exist.");
            return BigDecimal.ZERO; // You can return a default value or handle it as needed
        }
    }
}