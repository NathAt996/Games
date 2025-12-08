package Monster_Arena;

public class IceGiant extends Monster {

    public IceGiant(String name, int HP) {
        super(name, HP);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " inflicts 29pts of damage");
    }
}
