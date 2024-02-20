import java.util.Arrays;

public class lab_12_5 {
    public static void main(String[] args) {
        String[] names = {"Tom Hanks", "Leonardo DiCaprio", "Brad Pitt", "Meryl Streep", "Anthony Hopkins"};
        Arrays.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("Names in descending order:");
        for (String name : names) {
            System.out.println(name);
        }
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }
        double averageLength = (double) totalLength / names.length;
        System.out.println("Average length of all names: " + averageLength);
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + "*";
        }
        System.out.println("Modified names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}