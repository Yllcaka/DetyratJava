import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args) {

        /*
         * Equals() CompareTo() Empty() toUpperCase() Length()
         */

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "      Prometheu i mberthyer";
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str2.length());
        System.out.println(str3.trim());
        System.out.println(str1.startsWith("Wo"));

        // Second Example
        float brinjaA, brinjaB, rezultatiPerimetri, rezultatiSyprina;
        Scanner in = new Scanner(System.in);
        System.out.println("Shenoni brinjen a: ");
        brinjaA = in.nextFloat();
        System.out.println("Shenoni brinjen b: ");
        brinjaB = in.nextFloat();
        rezultatiPerimetri = ((2 * brinjaA) + (2 * brinjaB));
        rezultatiSyprina = (brinjaA * brinjaB);
        System.out.println(rezultatiPerimetri);
        System.out.println(rezultatiSyprina);
        in.close();

    }
}