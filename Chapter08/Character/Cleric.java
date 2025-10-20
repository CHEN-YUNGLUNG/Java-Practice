package Chapter08.Character;

public class Cleric {
    public String name;
    public int HP;
    final int Max_HP = 50;
    public int MP;
    final int Max_MP = 10;

    public void selfAid() {
        this.MP -= 5;
        this.HP = this.Max_HP;
        System.out.println(this.name + "は MP:5を消費してMaxHPまで回復しました。");

    }

    public int pray(int sec) throws Exception {
        int bonus = new java.util.Random().nextInt(3);
        int recover = sec + bonus;
        int before = this.MP;

        // 回復量超過MP上限時打斷祈禱
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
        // 正常祈禱
        this.MP = Math.min(this.Max_MP, this.MP + recover);
        int actualRec = this.MP - before;
        System.out.println(
                this.name + "は" + sec + "秒祈って、MPを" + actualRec + "回復しました。（現在: " + this.MP + "/" + this.Max_MP
                        + "）");
        return this.MP;

    }

}
