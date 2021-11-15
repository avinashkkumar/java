// 4. write a program to display fibonacci series.

import java.util.*;
public class fibonachiSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int m = 0;
        int n = 1;
        System.out.print("The fibonacchi series is : ");
        System.out.print(" " + m);
        System.out.print(" " + n);
        for(int i = 2 ; i < cnt ; i++){
            int sum = m + n;
            System.out.print(" " + sum);
            m = n;
            n = sum;
        }
        System.out.println("");
        sc.close();
    }
    
}
