package Monster_Arena;

public class Troll extends Monster {

    public Troll(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " inflicts 12pts of damage");
    }
}
