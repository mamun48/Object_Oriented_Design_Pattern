import java.util.HashMap;
import java.util.Map;

class RealWarehousingSystem implements WarehousingSystem {
    private Map<String, Integer> inventory;

    public RealWarehousingSystem() {
        inventory = new HashMap<>();
        // Initialize the inventory with some sample products.
        inventory.put("Product A", 100);
        inventory.put("Product B", 50);
        inventory.put("Product C", 75);
    }

    @Override
    public Map<String, Integer> getInventory() {
        return inventory;
    }
}