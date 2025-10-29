package Chapter10;

import Chapter10.Character.Cleric;

public class Matango {
    public int hp = 50;
    int damage = 10;
    char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public int attack(Cleric c) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        c.HP -= this.damage;
        return this.damage;
    }

}
