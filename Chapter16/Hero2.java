package Chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hero2 {
    private String name;

    public Hero2(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override // equals():定義什麼情況下兩個 Hero2 視為「相同」
    public boolean equals(Object o) {
        if (this == o) // 同一個物件
            return true;
        if (!(o instanceof Hero2)) // 類型不同
            return false;
        Hero2 other = (Hero2) o; // 安全轉型
        return Objects.equals(this.name, other.name); // 比內容
    }

    @Override // hashCode():確保相同 name 會得到相同雜湊碼
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public static void main(String[] args) {
        Hero2 h1 = new Hero2("斎藤");
        Hero2 h2 = new Hero2("鈴木");
        Map<Hero2, Integer> res = new HashMap<Hero2, Integer>();
        res.put(h1, 3);
        res.put(h2, 7);
        for (Hero2 key : res.keySet()) {
            int value = res.get(key);
            System.out.println(key + "が倒した敵＝" + value);
        }
    }

}
