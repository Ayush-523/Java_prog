import java.util.Scanner;

public class lab_12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("Names from index position 2 onwards:");
        for (int i = 2; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().startsWith("s")) {
                names[i] = names[i].replace('e', 'a').replace('E', 'A');
            }
        }
        System.out.println("Modified names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}