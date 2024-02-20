import java.util.Scanner;

public class lab_12_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of friend " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            String surname = parts[parts.length - 1];
            String firstname = parts[0];
            for (int j = 1; j < parts.length - 1; j++) {
                firstname += " " + parts[j];
            }
            String reversedName = reverseName(firstname) + " " + surname;
            System.out.println(reversedName);
        }
    }
    public static String reverseName(String name) {
        String[] parts = name.split(" ");
        String reversedName = parts[parts.length - 1];
        for (int i = parts.length - 2; i >= 0; i--) {
            reversedName += " " + parts[i];
        }
        return reversedName;
    }
}