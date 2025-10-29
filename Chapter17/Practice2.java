package Chapter17;

public class Practice2 {
    public static void main(String[] args) {
        String s = "三";
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.getMessage();
            System.out.println("無法使用非數字轉換數字");
            e.printStackTrace();
        }
    }

}
