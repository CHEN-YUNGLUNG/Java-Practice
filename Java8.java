import java.util.Scanner;
public class Java8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("こんにちは");
        System.out.printf("お腹空いたか？%n1=YES,0=NO%n>");
        int isHungry=s.nextInt();
        if(isHungry==1){
            System.out.println("何が食べたいですか？");
            String food=s.next();
            System.out.println(food+"をいただきます！");
            System.out.println("ごちそうさまでした！");
        }else if(isHungry==0){
            System.out.println("お腹いっぱいです！");
        }

    }
    
}
