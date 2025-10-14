package basic;
import basic.math1.geometry.*;
class App4{
    public static void main(String[] args){
        // 程式進入點
        /*System.out.println(Point.ORIGIN_X);
        Point.renderOrigin();
        // 呼叫建構式，產生 Point 物件實體
        Point obj=new Point(3,4);
        //System.out.println(obj.x+","+obj.y);
        obj.render(); // 呼叫物件方法
        Point obj2=new Point(1,1);
        obj2.render();*/
        System.out.println("請你們介紹一下自己的名字");
        Person P=new Person("新八","銀時");
        P.talk();
        System.out.println("請問這位是誰呢?");
        Person P2=new Person("伊莉莎白");
        P2.talk2();
        System.out.println("你們幾歲呢?");
        Person age=new Person("新八",18);
        age.talk3();
        Person age2=new Person(20,"銀時");
        age2.talk4();
    }
}