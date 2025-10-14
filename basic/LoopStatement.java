package basic;
import java.util.Scanner;
public class LoopStatement {
    public static void main(String[] args){
        // continue; 基本測試
        /*for(int x=1;x<=6;x++){
            if(x%3==0){ // 如果 x 被 3 整除
                continue; // 強制返回迴圈的上方 , 進入下一圈
            }
            System.out.println(x);
        }
            */
        // break; 基本測試
        /*int  x=0;
        while(x<=6){
            if(x==4){
                break; // 強制結束迴圈(直接跳到迴圈外面，如果有的話執行下一段程式)
            }
            System.out.println(x);
            x++;
        }*/
        // break 會跳到這邊來
        // 應用案例 : 連續輸入直到正確為止
        Scanner s=new Scanner(System.in);
        int number;
        while(true){
            System.out.println("請輸入一個正整數:");
            number=s.nextInt();
            if(number>0){ // 如果使用者輸入正確，強制結束迴圈
                break;
            }else{ // 如果使用者輸入錯誤，繼續執行迴圈
                System.out.println("輸入錯誤,再來一次");
            }
        }
        // 取得正確的輸入，做想要做的工作
        System.out.println("輸入正確:"+number);
    }
    
}
