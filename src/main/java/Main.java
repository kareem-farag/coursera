import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        System.out.println(getFib(n));

    }

    public static int getFib(int n) {
        if (n < 2) {

            return n;
        }
        int[] fibArray = new int[n + 1];


        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibArray[i] = (fibArray[i - 1] + fibArray[i - 2]) % 10;
        }

        return fibArray[n];
    }
}
