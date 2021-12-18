// Write a java program that asks the user name, and then greets the user by name.
// Before outputting the user's name, convert it to upper case letters. For
// example, if the user's name is Raj, then the program should respond
// "Hello, RAJ, nice to meet you!".

import java.util.Scanner;
public class userGreet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your name ");
        String st = sc.nextLine();
        st = st.toUpperCase();
        System.out.println("Hello, " + st + " nice to meet you !" );
        sc.close();
    }
}
