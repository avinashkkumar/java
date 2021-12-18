public class fibgen {
    public static void main(String args[]){
        int num  = Integer.parseInt(args[0]);
        gen(num);
    }
    public static void gen(int num){
        int i = 0 , j = 1;
        System.out.print(" " + i);
        for( int t = 0 ; t < num ; t++){
            int sum = i + j;
            i = j ;
            j = sum;
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
