import java.util.Scanner;

public class lab_12_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[7];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of sport " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("Names starting with '4':");
        for (String name : names) {
            if (name.startsWith("4")) {
                System.out.println(name);
            }
        }
        System.out.println("Names ending with '':");
        for (String name : names) {
            if (name.endsWith("")) {
                System.out.println(name);
            }
        }
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0, 3) + "m" + names[i].substring(3);
            names[i] = names[i].substring(0, 4) + names[i].substring(5);
        }
        System.out.println("Modified names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}