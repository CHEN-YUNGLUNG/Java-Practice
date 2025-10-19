package Chapter05;

public class PracticeF {

    public static double calcTriangleArea(double bottom,double height){
        double ans=(bottom*height)/2;
        return ans;
    }
    public static double calcCircleArea(double radius){
        double Pi=3.14159;
        double ans1=(radius*radius)*Pi;
        return ans1;
    }
    public static void main(String[] args){
        
        double bottom=10.0;
        double height=5.0;
        double ans3=calcTriangleArea(bottom,height);
        System.out.println("三角形の底辺の長さが"+bottom+"cm、高さが"+height+"cmの場合、面積は"+ans3+"平方cm");

        double radius=5.0;
        double ans4=calcCircleArea(radius);
        System.out.println("円の半径が"+radius+"cmの場合、面積は"+ans4+"平方cm");
    }
    
}
