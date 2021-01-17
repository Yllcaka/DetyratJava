public class MaxValueMethod {
  public static void main(String[] args) {

    max(3, 2);
    System.out.println(max(2, 3));
  }

  public static int max(int FirstNumber, int SecondNumber) {
    return FirstNumber >= SecondNumber ? FirstNumber : SecondNumber;
  }
}