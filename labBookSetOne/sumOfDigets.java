// 5. write a java program to calculate sum of digits of a number

import java.util.*;
public class sumOfDigets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sam = 0;
        do{
            sam = sam + (number%10);
            number = number/10;
        }while(number!=0);
        System.out.println(sam);
        sc.close();
    }
}
