import java.util.Scanner;
import java.util.Arrays;
 class nameSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array of string : ");
        int len = sc.nextInt();
        String st[] = new String[len] ;
        for( int i = 0 ; i < len ; i++){
            System.out.print("Enter the character at " + (i +1) + " : ");
            st[i] = sc.next();
        }
        sc.close();
        Arrays.sort(st);
        for( int i = 0 ; i < len ; i++ ){
            System.out.println(st[i]);
        }
        
    }
}
