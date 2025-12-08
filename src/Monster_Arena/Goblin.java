package Monster_Arena;

public class Goblin extends Monster {

    public Goblin(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " inflicts 5pts of damage");
    }
}
