// 3. write a program to accept a number from command prompt and generate multiplication table of a number

import java.util.*;
public class myltiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++ ){
            int multi = num * i ;
            System.out.println(num + " X " + i + " = " + multi);
        }
        sc.close();
    }
    
}
