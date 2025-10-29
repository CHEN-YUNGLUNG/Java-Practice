package Chapter11;

public abstract class TangibleAsset extends Asset implements Thing { // TangibleAsset繼承Asset加載Thing
    String color; // TangibleAsset這個抽象類別的欄位，用來儲存color資料
    double weight;// TangibleAsset這個抽象類別的欄位，用來儲存weight資料

    // TangibleAsset的建構式，因為在子類別建構式中呼叫父類別建構式（super(name, price)）來初始化父類欄位
    // 由於 Asset 沒有無參數建構式，子類別建構式必須明確呼叫 super(name, price)
    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price); // 呼叫父類別建構式以初始化共同欄位
        this.color = color; // 建立實體color
        this.weight = weight; // 建立實體weight
    }

    public String getColor() { // 設定TangibleAsset的方法
        return this.color;
    }

    @Override // 實作（implement）介面 Thing 的抽象方法
    public double getWeight() {
        return this.weight;
    }

    @Override // 實作（implement）介面 Thing 的抽象方法
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
