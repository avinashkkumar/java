// 10. write a program to calculate the sum of even numbers from an array.

import java.util.*;
public class evenSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array of 10 numbers");
        int arr[] = new int[10];
        for( int i = 0 ; i < 10 ; i++ ){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++ ){
            if(arr[i]%2 == 0 ){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
