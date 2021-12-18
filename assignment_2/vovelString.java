// 2A. Write a java program to display all the vowels from a given string.

import java.util.Scanner;
public class vovelString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to get the ");
        String st = sc.nextLine();

        for( int i = 0 ; i < st.length() ; i++ ){
            if( st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U'){
                     System.out.print(st.charAt(i));
                 }
            else{
                System.out.print(" ");
                continue;
            }
        }
        System.out.println();
        sc.close();
    }
}