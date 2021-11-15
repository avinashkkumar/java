// write a java program to check whether given string is palindrome or not

import java.util.*;
public class pelendrome {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0 ;
        int j = str.length()-1;
        boolean b = true;
        while ( j > i ) {
            if( str.charAt(i) != str.charAt(j)){
                b = false;
            }
        i++;
        j--;
        }
        if(b == true){
            System.out.println("its a pelendrome");
            }
        else{
            System.out.println("its not a pelendrome");
        }
        sc.close();
    }
}
