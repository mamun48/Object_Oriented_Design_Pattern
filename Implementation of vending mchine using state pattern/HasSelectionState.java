public class HasSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " already selected");
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Money: $" + amount + " inserted");
        vendingMachine.setCurrentState(new MoneyInsertedState(vendingMachine));
    }

    @Override
    public void executeTransaction() {
        System.out.println("Please insert money first");
    }

    @Override
    public void returnChange() {
        System.out.println("No change to return");
    }
}
