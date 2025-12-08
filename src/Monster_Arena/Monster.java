package Monster_Arena;

abstract class Monster {

    private int HP;
    private String name;

    public Monster(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return this.name;
    }

    public void attack() {
        System.out.println(getName() + " strikes");
    }

}
