package basic;
import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args){
        // 使用標準輸入 ( 從終端機輸入 )
        /*
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入一個整數:");
        int x=s.nextInt();
        System.out.println(x*10);
        */
        // if 判斷式
        /*
        Scanner s=new Scanner(System.in);
        System.out.println("請問你想領多少錢?");
        int money=s.nextInt();
        if(money>100000){
            System.out.println("太多了，不能領");
        }else if(money>=100){
            System.out.println("OK,錢在這");
        }else{
            System.out.println("太少了,不能領");
        }
            */
        // switch 判斷式
       /* double x=3;
        double y=4;
        System.out.println("請輸入想要做的運算(支援 + - * /):");
        Scanner s=new Scanner(System.in);
        String op=s.next();
        switch(op){
            case "+":
             System.out.println(x+y);
             break;
            case "-":
             System.out.println(x-y);
             break;
            case "*":
             System.out.println(x*y);
             break;
            case "/":
             System.out.println(x/y);
             break;
            default:
             System.out.println("非運算符號,請重新輸入:");        
        }
             */
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入要運算的數:");
        int a=s.nextInt(); // 先抓輸入的數字並代入到變數 a 中
        System.out.println("請輸入要計算的次方:");
        int b=s.nextInt(); // 再抓另一個輸入的數字並代入到變數 b 中
        int total=1; //總和變數的宣告
        // 上面的 Scanner 抓到後再套入下方 for迴圈 中進行程式運算
        for(int x=0;x<b;x++){ //次方變數宣告 + 判斷式 + 要做的事情
            total*=a;
        }
        System.out.println(total);
        
        
    }
    
}
