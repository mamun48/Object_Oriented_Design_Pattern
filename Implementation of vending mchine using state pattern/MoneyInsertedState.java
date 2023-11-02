public class MoneyInsertedState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public MoneyInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " already selected");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Additional money: $" + amount + " inserted");
    }

    @Override
    public void executeTransaction() {
        System.out.println("Transaction executed");
        vendingMachine.setCurrentState(new NoSelectionState(vendingMachine));
    }

    @Override
    public void returnChange() {
        System.out.println("Change returned");
        vendingMachine.setCurrentState(new NoSelectionState(vendingMachine));
    }
}
