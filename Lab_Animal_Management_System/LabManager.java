class LabManager {
   private Lab lab;
   public LabManager(Lab lab)
   {
        this.lab = lab;
   }
   public void addAnimalToCage(String cageNumber, Animal animal)
   {
        for(Cage cage : lab.getCageList())
        {
            if(cage.getCageNumber().equals(cageNumber))
            {
                cage.addAnimal(animal);
                return;
            }
        }
   }
   public void removeAnimalFromCage(String cageNumber, String animaId)
   {
        for(Cage cage : lab.getCageList())
        {
            if(cage.getCageNumber().equals(cageNumber))
            {
                cage.removeAnimalById(animaId);
            }
        }
   }
   public Animal findAnimalById(String animaId)
   {
        for(Cage cage : lab.getCageList())
        {
            for(Animal animal : cage.getAnimals())
            {
                if(animal.getId().equals(animaId))
                {
                    return animal;
                }
            }
        }
        return null;
   }
}
