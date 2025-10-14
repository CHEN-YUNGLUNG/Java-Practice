package basic.math1.geometry;

public class Point {
    // 類別的屬性和方法 (static)
    public static int ORIGIN_X=0;
    public static int ORIGIN_Y=0;
    public static void renderOrigin(){
        System.out.println(Point.ORIGIN_X+","+Point.ORIGIN_Y);
    }
    // 物件的屬性、方法、建構式 (non-static)
    public int x;//=3;
    public int y;//=4;
    public Point(int xArg,int yArg){
        this.x=xArg;
        this.y=yArg;
    }
    public void render(){
        //System.out.println("我是一個點");
        System.out.println(this.x+","+this.y);
    }
}
