public class Apartment implements HousingStructure {
    
        private String name;
    
        public Apartment(String name) {
            this.name = name;
        }
    
        @Override
        public void display() {
            System.out.println("Apartment: " + name);
        }
    }

