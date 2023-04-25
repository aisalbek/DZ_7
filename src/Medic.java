public class Medic extends Hero {
    private int healPoints ;

    public Medic(int heal, int damage, String superAbility, int healPoints) {
        super(heal, damage, superAbility);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic Hils");
    }
    public int increaseExperience (){
        int prosent = (((10*healPoints)/100));
        return healPoints += prosent;
    }
}
