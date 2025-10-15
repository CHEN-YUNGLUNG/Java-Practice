package basic;
class Test1{
    static int a=10;
    static String s="Hello Class";
}
class Test2{
    static double a=3.14;
    public static void main(String[] args){
        System.out.println(Test1.a); // 印出 10
        System.out.println(Test2.a); // 印出 3.14
        System.out.println(Test1.s); // 印出 Hello Class
        Test1.a++;
        System.out.println(Test1.a); 
    }
}