public abstract class Hero implements HavingSuperAbility {
    private int heal;
    private int damage;

    public Hero(int heal, int damage, String superAbility) {
        this.heal = heal;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    private String superAbility;

    @Override
    public void applySuperAbility() {

    }
}
