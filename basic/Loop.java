package basic;
public class Loop {
    public static void main(String[] args){
        // while 迴圈
        /* 無窮迴圈 , 可以按Ctrl + C 強制結束程式
         while(true){
           System.out.println("Loop");
         }
         */
        // 可以被控制運作次數的迴圈
        /*int x=1;
        while(x<=6){
            System.out.println(x);
            x++;
        }
        
        //計算 2的3次方
        int total=1;
        int x=1;
        while(x<=3){
            total=total*2;
            x++;
        }
        System.out.println(total);
        /*
         total=total*1;
         total=total*2;
         total=total*3;
         total=total*4;
         total=total*5;
         */
        // for 迴圈
        int total=1; //宣告變數要在最外面，程式才找的到宣告的變數
        for(int x=1;x<=10;x++){
            // int total=1; 這個程式抓不到宣告的變數
            total=total*2;  //程式區塊只做你想要做的動作，不能宣告變數
        }
        System.out.println(total);
    }
    
}
