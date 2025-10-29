package Chapter13;

import Chapter13.Sword;

public class Hero {
    private String name;
    private int HP;
    private int MP;
    private Sword sword;

    public Hero(Sword sword) {
        if (sword == null) {
            throw new IllegalArgumentException("剣がnullです。");
        }
        this.sword = sword;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return this.MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setSword(Sword sword) {
        if (sword == null) {
            throw new IllegalArgumentException("剣がnullです。");
        }
        this.sword = sword;
    }
}
