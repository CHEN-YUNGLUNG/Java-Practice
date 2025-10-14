public class Java6 {
    public static void main(String[] args){
        System.out.println("あなたの運勢を占いします");
        int fortune=new java.util.Random().nextInt(5);
        String s=switch(fortune){
            case 1->"大吉";
            case 2->"中吉";
            case 3->"吉";
            case 4->"凶";
            default ->"大凶";
        };
        System.out.println("運勢は"+s);
    }
    
}
