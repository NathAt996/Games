package Monster_Arena;

public class Knight extends Monster {

    public Knight(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " inflicts 15pts of damage");
    }
}
