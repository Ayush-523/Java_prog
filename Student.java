import java.util.Scanner;

class Student
{
    public static void main(String args[])
 {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter s to calculate area of square");
        System.out.println("Enter t to calculate area of triangle");
        System.out.print("Enter your choice: ");
        char choice = in.next().charAt(0);
        
        switch(choice) {
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = in.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
                
            case 's':
                System.out.print("Enter side of square: ");
                double side = in.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
                
            case 't':
                System.out.print("Enter base of Triangle: ");
                double b = in.nextDouble();
                System.out.print("Enter height of Triangle : ");
                double h = in.nextDouble();
                double ta = 0.5 * b * h;
                System.out.println("Area of Triangle = " + ta);
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}