import java.util.*;

public class UpperLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string for conversion to upper case : ");
        String s1 = sc.nextLine();
        System.out.print("enter string for conversion to lower case : ");
        String s2 = sc.nextLine();
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        sc.close();
    }
}
