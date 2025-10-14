package basic;
public class DataTypeConversion {
    public static void main(String[] args){
        //數字型態間的轉換
        //數字型態範圍大小的排序 : double > float > long > int > short > byte
        //小範圍轉到大範圍 : 自動轉換
        /*
        byte x=3;
        int y=x; // byte 轉換成 int
        System.out.println(y);
        long z=y; //int 轉換成 long
        System.out.println(z);
        double d=z; // long 轉換成 double
        System.out.println(d);
        */
        //大範圍轉到小範圍 : 需要使用 (資料型態) 做強制轉換
         /*int x=3;
         //byte y=x; // 錯誤 : 試圖把 int 轉換成 byte
         byte y=(byte)x;
         System.out.println(y);
         */
        //字串轉換成數字
        /*String text="34";
        int x=Integer.parseInt(text);
        System.out.println(x);
        text ="3.1415";
        double d=Double.parseDouble(text);
        System.out.println(d);
        text ="3.1415";
        float f=Float.parseFloat(text);
        System.out.println(f);
        */
        //數字轉換成字串
        int x=46;
        String s=String.valueOf(x);// 把 int 型態的 46 轉換成 String 型態的 "46"
        System.out.println(s);
        long y=99999;
        s=String.valueOf(y);
        System.out.println(s);
        String s1=String.valueOf(3.14159F);
        System.out.println(s1);
    }
}
