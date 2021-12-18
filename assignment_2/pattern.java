import java.util.Scanner;
 class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Pattern : ");
        int l = sc.nextInt();
        sc.close();
        for( int j = l ; j >= 1 ; j--){
            for( int i = j ; i <= l ; i++){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
