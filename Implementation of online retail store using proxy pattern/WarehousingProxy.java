import java.util.Map;

class WarehousingProxy implements WarehousingSystem {
    private RealWarehousingSystem realWarehousingSystem;

    public WarehousingProxy() {
        // The real warehousing system is created only when needed.
        realWarehousingSystem = null;
    }

    @Override
    public Map<String, Integer> getInventory() {
        if (realWarehousingSystem == null) {
            realWarehousingSystem = new RealWarehousingSystem();
        }
        // Perform additional operations or checks here if necessary.
        return realWarehousingSystem.getInventory();
    }
}






