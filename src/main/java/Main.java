import java.util.Scanner;

public class Main {

    public static void main (String args[]) {
        double firstNo = input("please enter first number");
        double secondNo = input("please enter second number");
        System.out.println(sum(firstNo,secondNo));

    }
    static Double input (String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    static Double sum (Double firstNo , Double secondNo) {
        return firstNo + secondNo ;
    }
}
