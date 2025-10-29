package Chapter13;

import Chapter13.Hero;
import Chapter13.Wizard;
import Chapter13.Wand;
import Chapter13.Sword;

public class Main {
    public static void main(String[] args) {
        Sword s1 = new Sword();
        s1.setName("英雄之劍");
        s1.setPower(600.0);
        Sword s2 = new Sword();
        s2.setName("斬神劍");
        s2.setPower(999.0);
        Hero h = new Hero(s1);
        h.setName("阿隆");
        h.setHP(100);
        h.setMP(100);
        System.out.println("英雄" + h.getName() + "誕生了!並獲得" + s1.getName());
        Wand w1 = new Wand();
        w1.setName("接骨木魔杖");
        w1.setPower(80);
        Wand w2 = new Wand();
        w2.setName("梅林的魔杖");
        w2.setPower(100);
        Wizard w = new Wizard(w1);
        w.setName("阿菜");
        w.setHP(100);
        w.setMP(200);
        System.out.println("偉大的魔法師" + w.getName() + "誕生了!並獲得" + w1.getName());
        w.heal(h);
        h.setSword(s2);
        System.out.println(h.getName() + "は" + s2.getName() + "に持ち替えた！");
        w.setWand(w2);
        System.out.println(w.getName() + "は" + w2.getName() + "に持ち替えた！");
        w.setWand(w1);
        System.out.println(w.getName() + "は" + w1.getName() + "に持ち替えた！");
        w.heal(h);
    }
}
