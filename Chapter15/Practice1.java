package Chapter15;

import java.util.Arrays; //要把陣列轉回字串需要import Arrays工具

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            sb.append(i).append(",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
        /*
         * for (String w : a) { // 用for 擴充迴圈逐一印出
         * System.out.print(w + ",");
         * }
         */
        // System.out.print(Arrays.toString(a)); //利用 Arrays.toString()方法把陣列轉回字串
        String b = String.join(",", a); // 利用 String.join()把陣列轉回字串
        System.out.print(b);
    }

}
