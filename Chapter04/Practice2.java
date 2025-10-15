package Chapter04;

public class Practice2 {
    public static void main(String[] args){
        int[] moneyList={121902,8302,55100};
    
        for(int i=0;i<moneyList.length;i++){
        System.out.printf("%7d%s",moneyList[i]," ");
        
    }
        System.out.println();
    
        for(int moneyList1 : moneyList){
        System.out.printf("%7d%s",moneyList1," ");
        
    }
        System.out.println();
 }
    
    
}
