class Birds extends Animal{
    private boolean canFly;

    public Birds(String id, String species, String gender, int ageInMonths, boolean canFly)
    {
        super(id, species, gender, ageInMonths);
        this.canFly = canFly;
    }
    @Override
    public String getAdditionalInfo()
    {
        return "It's a bird \n" + "Can fly: "+ canFly + "\n";
    }
    boolean getFly()
    {
        return canFly;
    }

    
}
