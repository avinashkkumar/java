import java.util.Scanner;

public class nameSearch {
    public static void main(String[] args) {
        String s[] = args;
        int l = args.length;
        int i = 0, flag = 0;
        System.out.print("Enter the string to search: ");
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        sc.close();
        for (i = 0; i < l; i++){
            System.out.println("   " + args[i]);
        }
        for (i = 0; i < l; i++) {
            if (s[i].compareTo(s2) == 0) {
                flag = 1;
                break;
            } else
                flag = 0;
        }
        if (flag == 1){
            System.out.println("\n String found at index:" + i);
        }
        else{
            System.out.println("\n Matching ```" + s2 + "``` String NOT found");
        }
    }
}