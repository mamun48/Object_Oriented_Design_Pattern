public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoSelectionState(this);
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void executeTransaction() {
        currentState.executeTransaction();
    }

    public void returnChange() {
        currentState.returnChange();
    }
}