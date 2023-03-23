import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "water";
    private List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() { return attacks; }

    public void setAttacks(List<String> attacks) { this.attacks = attacks; }

    @Override
    void attack(Pokemon enemy) {
        switch (getType()) {
            case "fire" -> {
                int newHp = enemy.getHp() - 30;
                setHp(newHp);
                System.out.println(enemy + " loses 30hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "water" -> {
                int newHp = enemy.getHp() - 10;
                setHp(newHp);
                System.out.println(enemy + " loses 10hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "grass" -> {
                int newHp = enemy.getHp() - 15;
                setHp(newHp);
                System.out.println(enemy + " loses 15hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "electric" -> {
                int newHp = enemy.getHp() - 20;
                setHp(newHp);
                System.out.println(enemy + " loses 20hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }

        }
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with surf.");
        attack(enemy);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with hydroPump.");
        attack(enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with hydroCanon.");
        attack(enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with rainDance.");
        switch (getType()) {
            case "fire" -> {
                int newHp = enemy.getHp() - 30;
                setHp(newHp);
                System.out.println(enemy + " loses 30hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "water" -> {
                int newHp = enemy.getHp() - 10;
                setHp(newHp);
                System.out.println(enemy + " loses 10hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "grass" -> {
                int newHp = enemy.getHp() + 15;
                setHp(newHp);
                System.out.println(enemy + " gets a boost of 15hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "electric" -> {
                System.out.println("Has no effect on " + enemy);
            }

        }
    }
}
