
import java.util.Scanner;
public class boardPrercent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float total = 0;
        System.out.println("enter the marks of 5 subject");
        for( int i = 0 ; i < 5 ; i ++ ){
            float cm = sc.nextFloat();
            total += cm;
        }
        System.out.print(" Enter the full marks of any subject ");
        float fm = sc.nextFloat();
        fm = (fm * 5);
        float percent = (( total / fm ) * 100);
        System.out.println("Your percentage is " + percent ); 
        sc.close();
    }
}
