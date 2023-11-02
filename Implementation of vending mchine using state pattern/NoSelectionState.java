public class NoSelectionState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " selected");
        vendingMachine.setCurrentState(new HasSelectionState(vendingMachine));
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Please select an item first");
    }

    @Override
    public void executeTransaction() {
        System.out.println("Please select an item first");
    }

    @Override
    public void returnChange() {
        System.out.println("No change to return");
    }
}
