package Chapter05;

public class Practice1 {
    public static void main(String[] args){
        int[] array={1,2,3};
        printArray(array);
    }
    public static void printArray(int[] array){
        for(int element : array){
            System.out.println(element);
        }
    }
    
}
