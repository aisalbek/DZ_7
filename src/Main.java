public class Main {
    public static void main(String[] args) {
       Magic magic = new Magic(100,10,"Magic damag");
       Medic medic = new Medic(80,5,"heals", 10);
       Warrior warrior = new Warrior(150,15,"Critical damag");
       Hero [] array = {magic,medic,warrior};
        for (Hero i:array) {
            i.applySuperAbility();

            if(i instanceof Medic){
                System.out.println(((Medic) i).getHealPoints());
                ((Medic) i).increaseExperience();
                System.out.println(((Medic) i).getHealPoints());

            }
        }
    }
}