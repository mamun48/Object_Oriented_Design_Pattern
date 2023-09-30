public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();

        lab.addCage(new Cage("Cage001"));

        LabManager labManager = new LabManager(lab);
        labManager.addAnimalToCage("Cage001", new Mammal("A001", "Ginuepig", "Female", 6, "black"));
        System.out.println(labManager.findAnimalById("A001"));
    }
    
}
