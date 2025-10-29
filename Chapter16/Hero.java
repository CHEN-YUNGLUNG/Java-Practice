package Chapter16;

import java.util.ArrayList;
import java.util.Iterator;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() { // 原本是預設的 Object.toString()的結果，所以需要覆寫toString()
        return this.name;
    }

    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        ArrayList<Hero> names = new ArrayList<Hero>();
        names.add(h1);
        names.add(h2);
        Iterator<Hero> it = names.iterator();
        while (it.hasNext()) {
            Hero e = it.next();
            System.out.println(e); // 因為上面Hero類別裡面已經有覆寫toString()了，如果沒有的話這邊應該要用 e.getName()
        }

    }
}
