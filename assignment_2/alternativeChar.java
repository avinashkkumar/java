// 4A.Write a java program to display alternate character from a given string.

import java.util.Scanner;

public class alternativeChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for( int i = 0 ; i < st.length() ; i ++ ){
            if(i%2 == 0){
                System.out.print(st.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
