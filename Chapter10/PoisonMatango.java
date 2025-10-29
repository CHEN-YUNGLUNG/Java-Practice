package Chapter10;

import Chapter10.Character.Cleric;

public class PoisonMatango extends Matango {
    public int poisonCount = 5;
    int totalDamage;

    public PoisonMatango(char suffix1) {
        super('B');
    }

    public int attack(Cleric c) {

        int damage = super.attack(c);
        this.totalDamage = totalDamage;
        if (poisonCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage = c.HP / 5;
            c.HP -= poisonDamage;
            poisonCount--;
            System.out.println(poisonDamage + "ポイントの追加ダメージ！");
            totalDamage = damage + poisonDamage;
            System.out.println(totalDamage + "ポイントのダメージ！");
            System.out.println("残り毒攻撃回数：" + poisonCount);
        }

        return totalDamage;

    }

}
