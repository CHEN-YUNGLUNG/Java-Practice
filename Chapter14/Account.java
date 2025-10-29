package Chapter14;

import java.util.Objects;

public class Account {
    private String accountName;
    private int balance;

    public void setName(String accountName) {
        this.accountName = accountName.trim();
    }

    public String getName() {
        return this.accountName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public String toString() {
        return "￥" + this.balance + "(" + "口座番号：" + this.accountName + ")";
    }

    public boolean equals(Object o) {
        if (this == o) // ① 如果是同一個物件參考 → true
            return true;
        if (!(o instanceof Account)) // ② 如果不是 Account 類 → false
            return false;
        Account other = (Account) o;// ③ 把對方物件轉成 Account
        return this.balance == other.balance && // ④ 比較 balance
                Objects.equals(this.accountName, other.accountName); // ⑤ 比較 name（安全）

    }

    public int hashCode() {
        return Objects.hash(accountName, balance); // equals() 和 hashCode() 的關係,這兩個方法是成對存在的，Java 規定：
                                                   // 如果兩個物件在 equals() 判斷下是「相等」的，那它們的 hashCode() 必須相同。
                                                   // 這樣，HashSet 或 HashMap 才能正確地辨識出「這是同一個物件」。
    }

}
