import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int firstInt = in.nextInt();
        int secondInt = in.nextInt();


        System.out.println(getGCD(firstInt, secondInt));

    }

    public static int getGCD(int firstInt, int secondInt) {

        double result = (Double.valueOf(firstInt) / Double.valueOf(secondInt));

        result = (result - Math.floor(result)) * secondInt;
        firstInt = secondInt;
        secondInt = (int) Math.round(result);
        System.out.println(firstInt + "-" + secondInt);
        if (secondInt == 0) {
            System.out.println(firstInt);
            System.exit(0);
            return firstInt;
        } else {
            getGCD(firstInt, secondInt);
            return secondInt;

        }


    }
}
