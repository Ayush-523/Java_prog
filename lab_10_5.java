import java.util.Scanner;

public class lab_10_5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        try {
            System.out.println("Enter the first element: ");
            array[0] = scanner.nextInt();

            System.out.println("Enter the second element: ");
            array[1] = scanner.nextInt();

            System.out.println("Enter the third element: ");
            array[2] = scanner.nextInt();

            System.out.println("Enter the index to display element: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);

        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index entered!");
        } catch (NumberFormatException e) 
        {
            System.out.println("Invalid input entered!");
        } catch (Exception e) 
        {
            System.out.println("An error occurred!");
        } finally 
        {
            System.out.println("Program executed successfully!");
        }
    }
}