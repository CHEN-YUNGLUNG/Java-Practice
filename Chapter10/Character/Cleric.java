package Chapter10.Character;

import Chapter10.Matango;
import Chapter10.PoisonMatango;;

public class Cleric {
    public String name;
    public int HP;
    public final int Max_HP = 50;
    public int MP;
    public final int Max_MP = 10;
    public int damage = 20;
    public int powerDamage = 100;

    public void selfAid() {
        this.MP -= 5;
        this.HP = this.Max_HP;
        System.out.println(this.name + "は MP:5を消費してMaxHPまで回復しました。");

    }

    public int pray(int sec) {
        int bonus = new java.util.Random().nextInt(3);
        int recover = sec + bonus;
        int before = this.MP;

        // 回復量超過MP上限時打斷祈禱
        try {
            if (this.MP + recover > this.Max_MP) {
                this.MP = this.Max_MP;
                System.out.println("……祈り続けている……");
                Thread.sleep(3000);
                System.out.println("……光があふれる……");
                System.out.println(this.name + "は" + sec + "秒祈ったが、");
                System.out.println("祈りは最大MPに達したため、自動的に終了しました。");
                System.out.println("MPはすでに満タンです。（現在: " + this.MP + "/" + this.Max_MP + "）");
                return this.MP;
            }
        } catch (InterruptedException e) {
            System.out.println("執行緒被中斷：" + e.getMessage());
        }

        // 正常祈禱
        this.MP = Math.min(this.Max_MP, this.MP + recover);
        int actualRec = this.MP - before;
        System.out.println(
                this.name + "は" + sec + "秒祈って、MPを" + actualRec + "回復しました。（現在: " + this.MP + "/" + this.Max_MP
                        + "）");
        return this.MP;

    }

    public int slashAttack(Matango m1) {
        System.out.println("聖職者" + this.name + "の斬撃！");
        System.out.println("20のダメージを与えました！");
        m1.hp -= this.damage;
        return this.damage;
    }

    public int slashAttack(PoisonMatango pm) {
        System.out.println("聖職者" + this.name + "の斬撃！");
        System.out.println("20のダメージを与えました！");
        pm.hp -= this.damage;
        return this.damage;
    }

    public int ultraAttack(Matango m1, PoisonMatango pm) {
        int actualMP = this.MP;
        this.MP -= 5;
        System.out.println("聖職者" + this.name + "の聖剣技！");
        System.out.println("聖職者" + this.name + "はMP：5 を消費しました");
        System.out.println("すべての魔物に100のダメージを与えました！");
        m1.hp -= this.powerDamage;
        pm.hp -= this.powerDamage;
        return powerDamage;
    }

}
