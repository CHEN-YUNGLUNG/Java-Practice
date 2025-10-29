package Chapter13;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHP() {
        return this.hp;
    }

    public void setMP(int mp) {
        this.mp = mp;
    }

    public int getMP() {
        return this.mp;
    }

    public Wizard(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖がnullです。");
        }
        this.wand = wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖がnullです。");
        }
        this.wand = wand;
    }

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        if (h == null) {
            throw new IllegalArgumentException("回復対象がnullです。");
        }
        h.setHP(h.getHP() + recovPoint);
        System.out.println(this.name + "Healを使用して" + h.getName() + "のHPを" + recovPoint + "回復した！");
    }

}
