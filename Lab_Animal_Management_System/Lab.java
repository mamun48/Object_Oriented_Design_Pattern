import java.util.ArrayList;
import java.util.List;

class Lab {
    private List<Cage> cages;

    public Lab()
    {
        this.cages = new ArrayList<>();
    }
    public List<Cage> getCageList()
    {
        return cages;
    }

    public void addCage(Cage cage)
    {
        cages.add(cage);
    }
    public void removeCage(String cageNumber)
    {
        cages.removeIf(cage -> cage.getCageNumber().equals(cageNumber));
    }
}
