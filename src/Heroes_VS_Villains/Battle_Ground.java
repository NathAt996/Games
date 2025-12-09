package Heroes_VS_Villains;

import java.util.ArrayList;
import java.util.List;

public class Battle_Ground {

    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();

        characters.add(new Heroes("Sir Galahad", "Paladin", "Long Sword", "Iron shield", 22, true));
        characters.add(new Villains("Count Orlok", "Vampire", "Bite", "Bat morph", 88, false));
        characters.add(new Heroes("Prince Llewelyn", "Human", "Iron Pike", "Steel shield", 35, true));
        characters.add(new Villains("Jötnar", "Mountain Troll", "Giant club", "Giant arm", 17, false));
        characters.add(new Heroes("Don Quixote De La Mancha", "Knight", "Rusty lance", "Wooden shield", 51, true));
        characters.add(new Villains("Ceridwen", "Sorceress", "Spell", "Forcefield", 77, false));
        characters.add(new Heroes("Aslan", "Lion", "Claw", "Paw", 37, true));
        characters.add(new Villains("Þrymr", "Ice Giant", "Ice mace", "Frosted shield", 101, false));

        System.out.println("BATTLEGROUND: HEROES VS VILLAINS");
        System.out.println();

        for(Character c : characters) {
            c.displayDetails();
            System.out.println();
        }

        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("______________________________________");
        System.out.println("       LET THE BATTLE BEGIN! ");
        System.out.println("______________________________________");
        System.out.println();

        for(Character c : characters) {
            System.out.println();
            System.out.println("In comes " + c.getName() + " ready for battle");
            c.attack();
            c.defend();
        }
    }
}
