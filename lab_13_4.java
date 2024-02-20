import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab_13_4 {

    public static void main(String[] args) {
        String inputFileName = "bcd.txt";
        String outputFileName = "bcd1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                String processedLine = line.replace("#", "*");
                processedLine = processedLine.replace("\n", "/");

                bw.write(processedLine);

                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}