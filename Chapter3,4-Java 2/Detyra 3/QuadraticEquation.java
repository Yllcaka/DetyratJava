import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vlera e A: ");
        double a = input.nextDouble();
        System.out.print("Vlera e B: ");
        double b = input.nextDouble();
        System.out.print("Vlera e C: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c; // Formula per gjetjen e domenes
        if (d > 0.0) {
            // Formulat e ekuacionit kuadratik nese domena eshte me e madhe se zero
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            //// Formulat e ekuacionit kuadratik nese domena eshte e barabarte me zero
            double r1 = -b / (2.0 * a);
            System.out.println("Rrenja eshte " + r1);
        } else {
            System.out.println("Vlera e rrenjeve nuk eshte reale.");
        }
    }
}