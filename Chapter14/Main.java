package Chapter14;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("4649");
        a.setBalance(1592);
        Account b = new Account();
        b.setName(" 4649");
        b.setBalance(1592);
        if (a.equals(b) == true) {
            System.out.println("同じ内容です");
        } else {
            System.out.println("違う内容です");
        }
        System.out.println(a);
    }

}
