import java.util.Arrays;

public class lab_12_1 {
    public static void main(String[] args) {
        String[] cities = {"New York", "Los Angeles", "Taris", "London", "Tokyo", "Sydney", "Rio de Janeiro", "Moscow", "Cairo", "Mumbai"};
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        if (hasDuplicates(cities)) {
            System.out.println("There are two or more cities that are the same.");
        } else {
            System.out.println("All city names are unique.");
        }
        for (String city : cities) {
            System.out.println(city.charAt(0));
        }
    }
    public static boolean hasDuplicates(String[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                return true;
            }
        }
        return false;
    }
}