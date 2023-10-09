import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        BankService bankService = new BankService();
        int savingAccountNumber = bankService.createNewAccount("saving", new BigDecimal(100));
        System.out.println(bankService.getBalance(savingAccountNumber));
        
        
    }
    
}
