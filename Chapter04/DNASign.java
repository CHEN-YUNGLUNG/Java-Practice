package Chapter04;

public class DNASign {
    public static void main(String[] args){
        int[] seq=new int[10];
        
        for(int i=0;i<seq.length;i++){
            seq[i]=new java.util.Random().nextInt(4);
        }
        
        for(int i=0;i<seq.length;i++){
            /*switch(seq[i]){
                case 0->{
                    System.out.print("A");
                }
                case 1->{
                    System.out.print("T");
                }
                case 2->{
                    System.out.print("G");
                }
                case 3->{
                    System.out.print("C");
                }
            }*/
            char[] base={'A','T','G','C'};
            System.out.print(base[seq[i]]+" ");
        }
    }
    
}
