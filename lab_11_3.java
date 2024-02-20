import java.util.Scanner;

class WrongMarkException extends Exception {
    public WrongMarkException(String message) {
        super(message);
    }
}

public class lab_11_3{
    public static void main(String[] args) {
        int[] marks = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            try {
                System.out.print("Enter mark " + (i + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark < 0 || mark > 100) {
                    throw new WrongMarkException("Mark must be between 0 and 100");
                }
                marks[i] = mark;
            } catch (WrongMarkException e) {
                System.out.println(e.getMessage() + " - Please enter a valid mark");
                i--;
            } catch (Exception e) {
                System.out.println("Invalid input - Please enter a valid integer");
                scanner.next();
                i--;
            }
        }

        System.out.println("Marks entered:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}