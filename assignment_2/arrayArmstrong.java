public class arrayArmstrong {
    public static void main(String arg[]) {
        int n, no, i = 0, sum = 0, r;
        int arm[] = new int[10];
        for (int j = 0; j < arg.length; j++) {
            n = Integer.parseInt(arg[j]);
            no = n;
            sum = 0;
            while (n > 0) {
                r = n % 10;
                n = n / 10;
                sum = sum + (r * r * r);
            }
            if (sum == no) {
                arm[i] = no;
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println("\n" + arm[j]);
        }   
    }
}