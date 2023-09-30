import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String cageNumber;
    private List<Animal> animals;
    public Cage(String cageNumber)
    {
        this.cageNumber = cageNumber;
        this.animals = new ArrayList<>();
    }
    public String getCageNumber()
    {
        return cageNumber;
    }
    public List<Animal> getAnimals()
    {
        return animals;
    }
    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }

    public void removeAnimalById(String id)
    {
        animals.removeIf(animal -> animal.getId().equals(id));
    }
}
