class Animal
{
    private String id;
    private String species;
    private String gender;
    private int ageInMonths;

    public Animal(String id, String species, String gender, int ageInMonths)
    {
        this.id = id;
        this.species = species;
        this.gender = gender;
        this.ageInMonths = ageInMonths;
    }

    public String getAdditionalInfo()
    {
        return " ";
    }
    public String getId()
    {
        return id;
    }
    public String getSpecies()
    {
        return species;
    }
    public String getGender()
    {
        return gender;
    }
    public int getAge()
    {
        return ageInMonths;
    }
    // Override toString for better representation
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(getAdditionalInfo());
        info.append("ID: ").append(id).append("\n");
        info.append("Species: ").append(species).append("\n");
        info.append("Gender: ").append(gender).append("\n");
        info.append("Age (months): ").append(ageInMonths).append("\n");
        
        return info.toString();
    }
}