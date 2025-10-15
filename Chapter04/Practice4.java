package Chapter04;

public class Practice4 {
    public static void main(String[] args){
        int[] numbers={3,4,9};
        
        java.util.Scanner s=new java.util.Scanner(System.in);

        boolean c=false;
        while(!c){
        System.out.println("1桁の数字を入力してください");
        int input=s.nextInt();
        
        boolean h=false;    
        for(int n : numbers){
            if(n==input){
                System.out.println("アタリ！");
                h=true;
                break;
            }
        }
        if(h){
            c=true;
        }else{
            System.out.println("もう一回試してみてください");
            
        }
      } 
      s.close();
    }
    
}
