import java.util.Scanner;

public class lab_12_7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of state " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("m")) {
                names[i] = "n" + names[i].substring(1);
            }
        }
        System.out.println("Modified state names:");
        for (String name : names) {
            System.out.println(name + "state");
        }
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0, 3) + "India" + names[i].substring(3);
        }
        System.out.println("Final modified state names:");
        for (String name : names) {
            System.out.println(name + "state");
        }
    }
}