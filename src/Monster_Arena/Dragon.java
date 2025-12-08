package Monster_Arena;

public class Dragon extends Monster {

    public Dragon(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " inflicts 23pts of damage");
    }
}
