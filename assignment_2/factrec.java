public class factrec {
    public static void main(String arg[]) {
        int num = Integer.parseInt(arg[0]);
        long fact = funfact(num);
        System.out.println("Factorial of " + num + "=" + fact);
    }

    public static long funfact(int num) {
        if (num >= 1)
            return num * funfact(num - 1);
        else
            return 1;
    }
}
