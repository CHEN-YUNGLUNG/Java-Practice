package Chapter03;
import java.util.Scanner;
public class Java10 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.printf("[選單] 1:檢索 2:登錄 3:刪除 4:變更%n>");
        int selected=s.nextInt();
        switch(selected){
            case 1->{
                System.out.println("檢索");
            }
            case 2->{
                System.out.println("登錄");
            }
            case 3->{
                System.out.println("刪除");
            }
            case 4->{
                System.out.println("變更");
            }
            
        }

    }
}
