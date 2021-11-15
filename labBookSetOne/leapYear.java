// 6. write a java program to accept a year and check if it is leap year or not .

import java.util.*;
public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean bol = false;
        int year = sc.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    bol = true;
                    System.out.println(400);
                }
                else{
                    bol = false;
                    System.out.println(450);
                }
            }
            bol = true;
            System.out.println(4);
        }
        else{
            bol = false;
            System.out.println(0);
        }
        if(bol == true){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
        sc.close();
    }
}
