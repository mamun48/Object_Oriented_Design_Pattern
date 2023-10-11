class Mammal extends Animal {
    private String hairColor ;
    public Mammal(String id, String species, String gender, int ageInMonths, String hairColor)
    {
        super(id, species, gender, ageInMonths);
        this.hairColor = hairColor;
    }
    public String getAdditionalInfo()
    {
        return "It's a mammal \n" + "Hair color: "+ hairColor + "\n";
    }
    String getHairColor()
    {
        return hairColor;
    }
}
