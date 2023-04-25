public class Warrior extends Hero {
    public Warrior(int heal, int damage, String superAbility) {
        super(heal, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Critical damag");
    }
}
