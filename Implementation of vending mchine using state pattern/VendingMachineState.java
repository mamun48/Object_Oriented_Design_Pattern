public interface VendingMachineState {
    void selectItem(String item);
    void insertMoney(int amount);
    void executeTransaction();
    void returnChange();
}