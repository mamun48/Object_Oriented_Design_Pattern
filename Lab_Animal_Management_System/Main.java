import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();

        lab.addCage(new Cage("Cage001"));
        LabManager labManager = new LabManager(lab);
        labManager.addAnimalToCage("Cage001", new Mammal("A001", "Ginuepig", "Female", 6, "black"));
        labManager.addAnimalToCage("Cage001", new Mammal("A002", "Tiger", "Male", 6, "Gray"));
        labManager.addAnimalToCage("Cage001", new Birds("A003", "Pigion", "Male", 5, true));
        System.out.println(labManager.findAnimalById("A001"));
        System.out.println(labManager.findAnimalById("A002"));
        labManager.removeAnimalFromCage("Cage001", "A001");
        System.out.println(labManager.findAnimalById("A002"));
    }
    
}
