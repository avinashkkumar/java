// 8. write a java program to accept two numbers using command line arguement and claculate addition, substraction, multiplication and dividion

public class mathoper {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int multi = a * b;
        int minus = a - b;
        int div = a / b;
        System.out.println("the sum of " + a + " and " + b + " is " + sum);
        System.out.println("the multiplication of " + a + " and " + b + "is " + multi);
        System.out.println(a + " divided by  " + b + " is " + div);
        System.out.println(a + " munus " + b + " is " + minus);
    }
}
