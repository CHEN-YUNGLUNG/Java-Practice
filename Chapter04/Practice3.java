package Chapter04;

public class Practice3 {
    public static void main(String[] args){
        int[] number = {3, 4, 9};
        java.util.Scanner s = new java.util.Scanner(System.in);
        boolean correct = false; // while啟動判斷式

        while (!correct) { // 為true所以啟動
            System.out.printf("１桁の数字を入力してください%n");
            int input = s.nextInt();

            boolean hit = false; //表示輸入的數是否命中目標數
            for (int i = 0; i < number.length; i++) {
                if (input == number[i]) {
                    System.out.println("アタリ！");
                    hit = true; //命中目標數後會把true值帶入hit後傳到下面的if
                    break;
                }
            }

            if (hit) { //if判斷hit為true後執行下面程式
                correct = true;//把true值帶入correct後回傳到while,while判斷式轉為false所以終止程式
            } else {
                System.out.println("ハズレ！もう一度試してください。");//再次嘗試的提示整個拿到for外就不會產生重複印出的情況
            }
        }

        s.close(); //要在main方法結束之前的位置 
    }
}
