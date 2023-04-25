public class Magic extends Hero{


    public Magic(int heal, int damage, String superAbility) {
        super(heal, damage, superAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic atak");
    }
}
