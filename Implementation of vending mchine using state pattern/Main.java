public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Chocolate");
        vendingMachine.insertMoney(2);
        vendingMachine.executeTransaction();
        vendingMachine.returnChange();
    }
}