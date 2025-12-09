package Heroes_VS_Villains;

abstract class Character implements Character_Interface{

    private String name;
    private String characterType;
    private String weapon;
    private String defense;
    private int HP;
    private boolean isHero;

    public Character(String name, String characterType, String weapon, String defense, int HP, boolean isHero) {

        this.name = name;
        this.characterType = characterType;
        this.weapon = weapon;
        this.defense = defense;
        this.HP = HP;
        this.isHero = isHero;
    }

    public String getName() {
        return this.name;
    }

    public String getCharacterType() {
        return this.characterType;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public String getDefense() {
        return this.defense;
    }

    public int getHP() {
        return this.HP;
    }

    public boolean getIsHero() {
        return this.isHero;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a " + getWeapon());
    }

    @Override
    public void defend() {
        System.out.println(getName() + " defends the counter with a " + getDefense());
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Is " + getName() + " a hero? " + getIsHero());
        System.out.println("Type: " + getCharacterType());
        System.out.println("Weapon: " + getWeapon());
        System.out.println("Defensive weapon: " + getDefense());
        System.out.println("Health Points: " + getHP());
    }
}
