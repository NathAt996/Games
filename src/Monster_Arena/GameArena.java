package Monster_Arena;

import java.util.ArrayList;

public class GameArena {

    public static void main(String[] args) {

        ArrayList<Monster> arenaLineUp = new ArrayList<>();

        arenaLineUp.add(new Goblin("Snoke, the goblin", 11));
        arenaLineUp.add(new Troll("Jötnar, the mountain troll", 35));
        arenaLineUp.add(new Dragon("Y Ddraig Aur, the Golden Dragon", 150));
        arenaLineUp.add(new Knight("The Black Knight of Tyr", 88));
        arenaLineUp.add(new IceGiant("Þrymr, the Ice Giant", 300));

        System.out.println("--- WELCOME TO THE MONSTER ARENA ---");
        System.out.println("______________________________________");

        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("    AND SO THE BATTLE BEGINS.....");
        System.out.println();

        for(Monster m : arenaLineUp) {
            System.out.println("In comes " + m.getName() + " ready for a fight!");
            m.attack();
            System.out.println();
        }
    }
}