// 2. wite a java program which acceps three integer values and print the maximum and minimum 

import java.util.Scanner;

public class maxOfThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a > b){
            if( b > c ){
                System.out.println("the maximum of three no is :" + a );
            }
            else if( c > a){
                System.out.println("the maximum of three no is :" + c);
            }
            else{
                System.out.println("the maximum of three no is :" + a);
            }
        }
        else if ( b > a ){
            if( b > c ){
                System.out.println("the maximum of theree no is :" + b );
            }
            else if( c > b ){
                System.out.println("the maximum of three no is :" + c );
            }
        }
        System.out.println("eof");
        sc.close();

    }
    
}
