package Chapter15;

public class Split {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String[] words = s.split("[,:]");
        for (String w : words) {
            System.out.print(w + "->");
        }
    }

}
