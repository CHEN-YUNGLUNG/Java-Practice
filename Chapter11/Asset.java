package Chapter11;

public abstract class Asset { // 抽象列別Asset
    String name; // 宣告變數
    int price;

    public Asset(String name, int price) { // 抽象類別的建構式(抽象類別雖不能被直接 new，但其建構式會由子類別在 super(...) 時被呼叫，用於初始化共同欄位)
        this.name = name;
        this.price = price;
    }

    public String getName() { // 抽象類別的方法，有回傳值
        return this.name;
    }

    public int getPrice() { // 抽象類別的方法，有回傳值
        return this.price;
    }
}
