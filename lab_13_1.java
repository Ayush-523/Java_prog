import java.io.*;

public class lab_13_1 {

   public static void main(String args[]) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the source file name: ");
      String sourceFileName = reader.readLine();
      System.out.print("Enter the destination file name: ");
      String destFileName = reader.readLine();

      FileReader inputFile = new FileReader("abc.txt");
      FileWriter outputFile = new FileWriter("abc1.txt");

      int ch;
      while ((ch = inputFile.read()) != -1) {
         outputFile.write(ch);
      }

      System.out.println("File copied successfully.");

      inputFile.close();
      outputFile.close();
   }
}