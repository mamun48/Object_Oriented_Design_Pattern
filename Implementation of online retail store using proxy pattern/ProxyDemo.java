import java.util.Map;

public class ProxyDemo {
    public static void main(String[] args) {
        WarehousingSystem warehousing = new WarehousingProxy();

        // Access the inventory through the proxy.
        Map<String, Integer> inventory = warehousing.getInventory();

        // Display the inventory.
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}




