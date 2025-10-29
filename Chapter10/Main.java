package Chapter10;

import Chapter10.Character.Cleric;
import Chapter10.Matango;
import Chapter10.PoisonMatango;

public class Main {
    public static void main(String[] args) throws Exception {

        // 聖職者を生成
        Cleric c = new Cleric();
        // フィールドに初期値をリセット
        c.name = "タカシ";
        c.HP = 50;
        c.MP = 10;
        System.out.println("聖職者" + c.name + "を生み出しました！");

        // お化けキノコを生成 毒お化けキノコを生成
        Matango m1 = new Matango('A');
        System.out.println("お化けキノコ：" + m1.suffix + " 出現しました！");

        PoisonMatango pm = new PoisonMatango('B');
        System.out.println("毒お化けキノコ：" + pm.suffix + " 出現しました！");

        // お化けキノコと毒お化けキノコを攻撃する
        int dmg = m1.attack(c);
        int pdmg = pm.attack(c);
        System.out.println("聖職者" + c.name + "は" + (dmg + pdmg) + "ダメージを受けました！");
        System.out.println("聖職者" + c.name + "のHP：" + c.HP + "/" + c.Max_HP);
        System.out.println("聖職者" + c.name + "のMP：" + c.MP + "/" + c.Max_MP);

        // 聖職者のスキルを発動する
        c.selfAid();
        c.pray(2);

        // 戦闘結果
        System.out.println("聖職者" + c.name + "のHP：" + c.HP + "/" + c.Max_HP);
        System.out.println("聖職者" + c.name + "のMP：" + c.MP + "/" + c.Max_MP);

        // 聖職者の攻撃を発動する
        int sldmg = c.slashAttack(m1);
        System.out.println("お化けキノコ：" + m1.suffix + "は" + sldmg + "ポイントのダメージを受けました！");

        int sldmg2 = c.slashAttack(pm);
        System.out.println("毒お化けキノコ：" + pm.suffix + "は" + sldmg2 + "ポイントのダメージを受けました！");

        int podmg = c.ultraAttack(m1, pm);
        System.out.println("お化けキノコ：" + m1.suffix + " と 毒お化けキノコ：" + pm.suffix + " は" + podmg + "ポイントのダメージを受けました！");

        boolean deadM = m1.hp <= 0;
        boolean deadPM = pm.hp <= 0;

        if (deadM && deadPM) {
            System.out.println("すべての魔物を討伐しました！！");

        } else if (deadM) {
            System.out.println("お化けキノコ：" + m1.suffix + "を倒しました！！");

        } else if (deadPM) {
            System.out.println("毒お化けキノコ：" + pm.suffix + "を倒しました！！");

        }

        // 戦闘結果
        System.out.println("聖職者" + c.name + "のHP：" + c.HP + "/" + c.Max_HP);
        System.out.println("聖職者" + c.name + "のMP：" + c.MP + "/" + c.Max_MP);

    }
}
