package basic;
import  java.util.Scanner;
public class Array {
    public static void main(String[] args){
        // 陣列的基本操作練習
       /*int[] grades=new int[]{70,80,90,100};
        System.out.println("陣列長度:"+grades.length);
        grades[0]=70;
        grades[1]=80;
        grades[2]=90;
        for(int x=0;x<grades.length;x++){
            System.out.println(grades[x]);
        }
        /*System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);*/
        
        //輸入學生的數量，以及每位學生的成績，計算平均數
        System.out.println("請輸入學生數量:");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int[] grades=new int[number];
        System.out.println("請逐一輸入學生成績:");
        for(int i=0;i<grades.length;i++){
            grades[i]=s.nextInt();
        }
        // 計算平均數，先算總和
        int total=0;
        for(int i=0;i<grades.length;i++){
            total+=grades[i];
        }
        int avg=total/grades.length;
        System.out.println("本次學生共有:"+grades.length+"人"+","+"平均成績為:"+avg);
        /*
         grades[0]=s.nextInt();
         grades[1]=s.nextInt();
         grades[2]=s.nextInt();
         */
    } 
    
}
