package basic;
public class DataTypeVariable{
    public static void main(String[] args){
        //在終端機印出各種資料型態
        //整數 · 預設是 int 型態
        int x=3;
        int y=120;
        System.out.println(x);
        System.out.println(y);
        int z=5;
        System.out.println(z);
        z=150;
        System.out.println(z);
        //長整數 · 數字後面特別加上 L
        long l=20000000000000L;
        System.out.println(l);
        //浮點數 · 預設為 double 型態
        double m=3.14159268;
        System.out.println(m);
        //單精度浮點數 · 數字後面特別加上F
        float n=3.14159268F;
        System.out.println(n);
        //布林值
        boolean b=true;
        System.out.println(b);
        //字元
        char c='我';
        System.out.println(c);
        //字串 : 可以包含 0 到多個字元
       String s="我愛老婆菜菜";
        System.out.println(s);
        s="今天是老公生日~"; //再宣告另一個 S 變數來覆蓋上一個 S 變數
        System.out.println(s);
       
    }
}