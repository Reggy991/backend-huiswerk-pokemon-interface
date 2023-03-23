import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type = "grass";
    private List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() { return attacks; }

    public void setAttacks(List<String> attacks) { this.attacks = attacks; }

    @Override
    void attack(Pokemon enemy) {
        switch (getType()) {
            case "fire" -> {
                int newHp = enemy.getHp() - 20;
                setHp(newHp);
                System.out.println(enemy + " loses 20hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "water" -> {
                int newHp = enemy.getHp() - 15;
                setHp(newHp);
                System.out.println(enemy + " loses 15hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "grass" -> {
                int newHp = enemy.getHp() - 10;
                setHp(newHp);
                System.out.println(enemy + " loses 10hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "electric" -> {
                int newHp = enemy.getHp() - 30;
                setHp(newHp);
                System.out.println(enemy + " loses 30hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }

        }
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with leafStorm.");
        attack(enemy);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with solarBeam.");
        attack(enemy);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with leechSeed.");
        switch (getType()) {
            case "fire" -> {
                int newHp = enemy.getHp() - 20;
                setHp(newHp);
                int newHpPokemon = name.getHp() + 20;
                System.out.println(enemy + " loses 20hp and " + name + " gets a boost of 20hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
                System.out.println(name + "s new hp is: " + newHpPokemon);
            }
            case "water" -> {
                int newHp = enemy.getHp() - 15;
                setHp(newHp);
                int newHpPokemon = name.getHp() + 15;
                System.out.println(enemy + " loses 15hp and " + name + " gets a boost of 15hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
                System.out.println(name + "s new hp is: " + newHpPokemon);
            }
            case "grass" -> {
                int newHp = enemy.getHp() - 10;
                setHp(newHp);
                int newHpPokemon = name.getHp() + 10;
                System.out.println(enemy + " loses 10hp and " + name + " gets a boost of 10hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
                System.out.println(name + "s new hp is: " + newHpPokemon);
            }
            case "electric" -> {
                int newHp = enemy.getHp() - 30;
                setHp(newHp);
                int newHpPokemon = name.getHp() + 30;
                System.out.println(enemy + " loses 30hp and " + name + " gets a boost of 30hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
                System.out.println(name + "s new hp is: " + newHpPokemon);
            }

        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with leaveBlade.");
        attack(enemy);
    }
}
