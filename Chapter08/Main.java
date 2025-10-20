package Chapter08;

import Chapter08.Character.Cleric;

public class Main {
    public static void main(String[] args) throws Exception {
        // 聖職者を生成
        Cleric c = new Cleric();
        // フィールドに初期値をリセット
        c.name = "タカシ";
        c.HP = 50;
        c.MP = 10;
        System.out.println("聖職者" + c.name + "を生み出しました！");

        // 聖職者のメソッドを呼び出しでゆく
        c.selfAid();
        c.pray(2);
    }
}
