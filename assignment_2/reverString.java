// Write a java program to display each String in reverse order from a String array.

import java.util.Scanner;
public class reverString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String rstring = new String();
        for(int i = st.length()-1 ; i >= 0 ; i--){
            rstring = rstring + st.charAt(i);
        }
        System.out.println(rstring);
        sc.close();
    }
}
