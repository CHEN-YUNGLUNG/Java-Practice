package basic.math1.geometry;

public class Person {
    public String S1;
    public String S2;
    public String S3;
    public String S4;
    public String S5;
    public int x;
    public int y;
    public Person(String s1,String s2){
        this.S1=s1;
        this.S2=s2;
    }
    public Person(String s3){
        this.S3=s3;
    }
    public Person(String n,int a){
        this.S4=n;
        this.x=a;
    }
    public Person(int b,String m){
        this.S5=m;
        this.y=b;
    }
    public void talk(){
        System.out.println("我的名字是:"+this.S1);
        System.out.println("我的名字是:"+this.S2);
    }
    public void talk2(){
        System.out.println("他是:"+S3);
    }
    public void talk3(){
        System.out.println(this.S4+this.x);
        
    }
    public void talk4(){
        System.out.println(this.S5+this.y);
    }
    
}
