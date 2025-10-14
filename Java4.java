import java.util.Scanner;
public class Java4 {
    public static void main(String[] args){
        /*String prof1="名前:朝香あゆみ\n       (朝香あゆみ)";
        String prof2="""
                名前：湊雄輔
                       (みなとゆうすけ)
                """;
        String price="今日所需預算為:"+"￥1000000円";   
        System.out.println(prof1);
        System.out.println(prof2);    
        System.out.println(price);
        System.out.println("\"");*/
        /*int r=new java.util.Random().nextInt(100); // 建立亂數 nextInt(想產生的亂數最大值)
        System.out.println(r);*/
        Scanner s=new Scanner(System.in);
        System.out.println("請輸入姓名:");
        //String s=new java.util.Scanner(System.in).nextLine();
        String name=s.next();
        System.out.println("請輸入年齡:");
        //int age=new java.util.Scanner(System.in).nextInt();
        int age=s.nextInt(); 
        System.out.println("姓名:"+name+","+"年齡為:"+age);   
    }
    
}
