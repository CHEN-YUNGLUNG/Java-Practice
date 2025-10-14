package basic;
class Test{
    public static void main(String[] args){
        // 程式進入點
        Test.talk("Hello"); // 呼叫類別的方法
        Test.talk("你好");
        int ans=BasicMath.add(3,4);// 要先宣告一個變數,下面的 ans 才能被覆蓋
        System.out.println(ans);
        ans=BasicMath.multiply(3,2);// 這邊的 ans 是用 BasicMath.multiply的值把上面的 ans 的值給覆蓋成 BasicMath.multiply的值
        System.out.println(ans);
    }
    // 定義更多自己的類別方法
    static void talk(String content){
        System.out.println(content);
    }
    
}
class BasicMath{
    static int add(int n1,int n2){
        //int result=n1+n2;
        //System.out.println(result);
        return n1+n2;
    }
    static int multiply(int n1,int n2){
        //int result=n1*n2;
        //System.out.println(result);
        return n1*n2;
    }
}