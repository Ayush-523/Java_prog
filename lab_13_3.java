import java.io.*;

public class lab_13_3 {

   public static void main(String args[]) throws IOException {

      if (args.length != 2) {
         System.exit(1);
      }

      BufferedReader reader = new BufferedReader(new FileReader(args[0]));
      BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

      String line;
      while ((line = reader.readLine()) != null) {
         String[] words = line.split("\\s");
         for (String word : words) {
            if (word.length() > 0) {
               char firstChar = Character.toUpperCase(word.charAt(0));
               String restOfWord = word.substring(1);
               writer.write(firstChar + restOfWord + " ");
            }
         }
         writer.newLine();
      }

      reader.close();
      writer.close();
   }
}