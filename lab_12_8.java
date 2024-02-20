import java.util.Scanner;

public class lab_12_8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("Programming subjects:");
        for (String name : names) {
            if (name.toLowerCase().contains("programming")) {
                System.out.println(name.trim().toLowerCase());
            }
        }
        System.out.println("Reversed subject names:");
        for (String name : names) {
            StringBuilder reversedName = new StringBuilder(name.trim().toLowerCase());
            System.out.println(reversedName.reverse().toString());
        }
    }
}