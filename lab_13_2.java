import java.io.*;

public class lab_13_2 {

    public static void main(String args[]) throws IOException {

        if (args.length != 2) {
            System.exit(1);
        }

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        FileInputStream fis1 = new FileInputStream("bcd.txt");
        FileInputStream fis2 = new FileInputStream("bcd1.txt");

        int b1, b2;
        int position = 0;
        while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {
            position++;
            if (b1 != b2) {
                System.out.println("Files differ at position " + position);
                fis1.close();
                fis2.close();
                return;
            }
        }

        if (fis1.read() != fis2.read()) {
            System.out.println("Files have different lengths.");
        } else {
            System.out.println("Files are identical.");
        }

        fis1.close();
        fis2.close();
    }
}