package Chapter05;

public class Practice5 {
    
    public static void email(String address,String title){

        System.out.println(address+"に、以下のメールを送信しました");
        System.out.println("件名："+title);
        
    }
    public static void email(String text){

        System.out.println("本文："+text);

    }
    public static void main(String[] args){
        email("メールのタイトル","無題");
        email("メールの宛先アドレス");
    }
    
}

    

