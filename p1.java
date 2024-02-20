import java.util.*;
class p1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Box box = new Box();
    System.out.print("Enter length: ");
    box.length = sc.nextDouble();  
    System.out.print("Enter width: ");
    box.width = sc.nextDouble();
    System.out.print("Enter height: ");
    box.height = sc.nextDouble();
    System.out.println("Volume of the box is: " + box.volume());
    sc.close();
  }
}
class Box {
    double length;
    double width;
    double height;
    double volume() {
      return length * width * height;
    }
}
