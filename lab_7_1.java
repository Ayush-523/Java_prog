import java.util.Scanner;

class TwoD {
    double length;
    double width;

    public TwoD(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width; 
    }

    public double cost() {
        return area() * 40;
    }
}

class ThreeD extends TwoD {
    double height;

    public ThreeD(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    public double volume() {
        return length * width * height;
    }

    public double cost() {
        return volume() * 60;
    }
}

public class lab_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and width of the plastic sheet: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        TwoD sheet = new TwoD(l, w);
        System.out.println("Cost of sheet: Rs " + sheet.cost());

        System.out.print("Enter the length, width, and height of the plastic box: ");
        l = sc.nextDouble();
        w = sc.nextDouble();
        double h = sc.nextDouble();
        ThreeD box = new ThreeD(l, w, h);
        System.out.println("Cost of box: Rs " + box.cost());

        sc.close();
    }
}