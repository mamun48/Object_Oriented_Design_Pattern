import java.util.ArrayList;
import java.util.List;

public class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    public void removeStructure(HousingStructure structure) {
        structures.remove(structure);
    }

    @Override
    public void display() {
        System.out.println("Building: " + name);
        System.out.println("Structures inside the building:");
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}
