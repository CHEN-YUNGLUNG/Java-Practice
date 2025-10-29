package Chapter11;

public interface Thing { // 介面Thing
    public abstract double getWeight(); // 宣告抽象方法(無參數)

    public abstract void setWeight(double weight);// 宣告抽象方法(無參數，但有寫此方法要帶入double weight這項參數，但是開頭並沒有宣告參數所以OK)

}

// 注意：若在介面中宣告變數，會被視為 public static final 常數
// 例如：int MAX = 10; // 等同於 public static final int MAX = 10;
// 另外：介面可有 default/static 方法（Java 8+），private 方法（Java 9+）
