import java.util.Scanner;

public class lab_12_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of film " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("Names starting with 'k' and ending with 'a':");
        for (String name : names) {
            if (name.startsWith("k") && name.endsWith("a")) {
                System.out.println(name);
            }
        }
        System.out.println("Substring of all names from 1st to 3rd position:");
        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }
        System.out.println("Last occurrence of 'e' for all names:");
        for (String name : names) {
            int index = name.lastIndexOf('e');
            if (index != -1) {
                System.out.println(name + ": " + index);
            }
        }
    }
}