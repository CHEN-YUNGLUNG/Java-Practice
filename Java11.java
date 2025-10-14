import java.util.Scanner;
public class Java11 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int ans=new java.util.Random().nextInt(9);
        System.out.println("猜數字遊戲");
        for(int i=1;i<10;i++){
            System.out.printf("請輸入數字1~9%n>");
            int num=s.nextInt();
            if(num==ans){
                System.out.println("恭喜中獎!!");
                break;
            }else{
                System.out.println("很可惜,沒猜中...");
            }
        }
        System.out.println("~遊戲結束~");

    }
    
}
