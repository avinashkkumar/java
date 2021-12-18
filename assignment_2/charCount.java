// Write a java program to count the frequency of each character in a given string.

import java.util.Scanner;

public class charCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(char ch = 'a' ; ch <= 'z' ; ch ++){
            int count = 0;
            for( int i = 0 ; i < st.length() ; i++){
                if(ch == st.charAt(i)){
                    count = count + 1;
                }
            }
            if( count > 0){
                System.out.println(ch + " = " + count);
            }
        }
        sc.close();
    }
}
