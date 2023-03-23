import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {
    private final String name;
    private String type;
    private int level;
    private int hp;
    private final String food;
    private final String sound;

    private final List<String> attacks = Arrays.asList();

    public String getType() {
        return type;
    }


    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() { return name; }

    public int getLevel() { return level; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp;}

    public String getFood() { return food; }

    public String getSound() { return sound; }

    public List<String> getAttacks() {
        return attacks;
    }

    abstract void attack(Pokemon enemy);
}
