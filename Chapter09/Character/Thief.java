package Chapter09.Character;

public class Thief {
    public String name;
    public int hp;
    public int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }

    public Thief(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = 5;
    }

    public Thief(String name) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }

    public Thief() {
        this("ゾー");
    }

}
