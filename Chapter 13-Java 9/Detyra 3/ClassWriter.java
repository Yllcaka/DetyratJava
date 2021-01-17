import java.io.FileWriter;
import java.io.IOException;

public class ClassWriter {
  public static void main(String[] args) {
    try {
      // Krijo klasen ClassWriter e cila ne metoden main krijon nje file me emrin
      // file.txt
      FileWriter myWriter = new FileWriter("file.txt");
      // Brenda file te shkrhet mesazhi “Hello from Java”

      myWriter.write("Hello from Java");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}