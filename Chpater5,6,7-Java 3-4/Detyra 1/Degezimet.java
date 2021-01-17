import java.util.Scanner;

public class Degezimet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Shtypeni poenat tuaja ");
    int average = sc.nextInt();
    String grade;

    if (average > 100) {
      grade = "Numri i poenave eshte me i madh se 100";
    } else if (average < 0) {
      grade = "Numri i poenave eshte me i vogel se 0";
    } else if (average >= 90) {
      grade = "10";
    } else if (average >= 80) {
      grade = "9";
    } else if (average >= 70) {
      grade = "8";
    } else if (average >= 60) {
      grade = "7";
    } else if (average >= 50) {
      grade = "6";
    } else {
      grade = "5";
    }
    System.out.println("Programi per paraqitjen e notes");
    System.out.println("===============================");
    System.out.println("Poenat: " + average);
    System.out.println("Nota: " + grade);
    System.out.println("===============================");

  }
}