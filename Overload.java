import java.util.*;

class OverloadDemo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length and breadth");
       float l=sc.nextFloat();
       float b=sc.nextFloat();
       System.out.println("Enter side");
       float s=sc.nextFloat();
       System.out.println("Enter radius");
       double r=sc.nextDouble();
       ob.area(s);
	   ob.area(l,b);
	   ob.area(r);
       
	   /*
       ob.area(5);
	   ob.area(11,12);
	   ob.area(2.5);
      */
        }
}