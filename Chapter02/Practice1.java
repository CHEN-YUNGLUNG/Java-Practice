package Chapter02;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
       System.out.println("ようこそ占い館へ");
       Scanner s=new Scanner(System.in);
       System.out.println("あなたの名前を入力してください:");
       String name=s.next();
       System.out.println("あなたの年齢を入力してください:");
       String age=s.next();
       int age1=Integer.parseInt(age);
       int fortune=new java.util.Random().nextInt(3);
       fortune+=1;
       System.out.println("占いの結果が出ました！");
       System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune);
       System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");

    }
    
}
