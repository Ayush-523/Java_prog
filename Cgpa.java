import java.util.Scanner;

class Cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] rolls = new int[n];
        double[] cgpa = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter the roll number of student " + (i + 1) + ": ");
            rolls[i] = scanner.nextInt();
            System.out.print("Enter the CGPA of student " + (i + 1) + ": ");
            cgpa[i] = scanner.nextDouble();
        }
        double lowestCgpa = cgpa[0];
        String lowestCgpaName = names[0];
        for (int i = 1; i < n; i++) {
            if (cgpa[i] < lowestCgpa) {
                lowestCgpa = cgpa[i];
                lowestCgpaName = names[i];
            }
        }
        System.out.println("Details of students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + ", Roll: " + rolls[i] + ", CGPA: " + cgpa[i]);
        }
        System.out.println("Student with the lowest CGPA: " + lowestCgpaName);
    }
}