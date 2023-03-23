import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "fire";
    private List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public List<String> getAttacks() { return attacks; }

    public void setAttacks(List<String> attacks) { this.attacks = attacks; }

    @Override
    void attack(Pokemon enemy) {
        switch (getType()) {
            case "fire" -> {
                int newHp = enemy.getHp() - 10;
                setHp(newHp);
                System.out.println(enemy + " loses 10hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "water" -> {
                int newHp = enemy.getHp() - 20;
                setHp(newHp);
                System.out.println(enemy + " loses 20hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "grass" -> {
                int newHp = enemy.getHp() - 30;
                setHp(newHp);
                System.out.println(enemy + " loses 30hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }
            case "electric" -> {
                int newHp = enemy.getHp() - 15;
                setHp(newHp);
                System.out.println(enemy + " loses 15hp.");
                System.out.println(enemy + "s new hp is: " + newHp);
            }

        }
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with fireLash.");
        attack(enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with flameThrower.");
        attack(enemy);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with pyroBall.");
        attack(enemy);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with inferno.");
        attack(enemy);
    }

}
