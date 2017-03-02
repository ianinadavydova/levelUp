import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ianina on 01.03.17.
 */

public class LineEq {

    private static boolean isInputIncorrect(double a, double b) {
        return (a >= 1e9 || b >= 1e9 || Double.isInfinite(a) || Double.isInfinite(b) || Double.isNaN(a) || Double.isNaN(b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        if (isInputIncorrect(a, b)) {
            System.out.println("Incorrect input");
        } else if (a == 0 && b == 0) {
            System.out.println("x - any");
        } else if (a == 0) {
            System.out.println("No solutions");
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}