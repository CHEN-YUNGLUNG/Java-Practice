package Chapter15;

public class Practice2 {
    public static String concatPath(String folder, String file) { // 有static 是靜態方法
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }

    public String concatPath1(String folder1, String file1) { // 無static 是實例方法
        if (!folder1.endsWith("\\")) {
            folder1 += "\\";
        }
        return folder1 + file1;
    }

    public static void main(String[] args) {
        String folder = "C:\\javadev";
        String file = "readme.txt";
        System.out.print(concatPath(folder, file) + "\n"); // 靜態方法可以在Main方法裡呼叫，最後印出方法裡的東西

        String folder1 = "C:\\javadev";
        String file1 = "readme.txt";
        Practice2 p2 = new Practice2(); // 實例方法需要有物件才能呼叫，所以這邊要new一個物件出來
        String f = p2.concatPath(folder1, file1);// 然後用物件呼叫方法
        System.out.print(f);// 最後才能印出來方法裡的東西
    }

}
