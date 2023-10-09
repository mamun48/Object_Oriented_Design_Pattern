public class CompositePattern {
    public static void main(String[] args) {
        // Create leaf housing structures
        Apartment apt1 = new Apartment("Apartment 1");
        House house1 = new House("House 1");
        House house2 = new House("House 2");

        // Create a composite building
        Building building = new Building("My Building");
        building.addStructure(apt1);
        building.addStructure(house1);

        // Add a sub-building to the main building
        Building subBuilding = new Building("Sub-Building");
        subBuilding.addStructure(house2);
        building.addStructure(subBuilding);

        // Display the entire structure
        building.display();
    }
}