import java.util.Scanner;
class lab5{
	void subtract()
	{
		Scanner sc= new Scanner(System.in);
		int a, b, c;
		System.out.println("enter 2 numbers");
		a= sc.nextInt();
		b= sc.nextInt();
		c=a-b;
		System.out.println("Difference = "+c);
		sc.close();
	}
	void subtract(int x, int y)
{
	int z=x-y;
	System.out.println("difference ="+z);
}
public static void main ( String[] args)
{
	lab5 obj=new lab5();
	lab5 obj2= new lab5();
	obj.subtract();
	obj2.subtract(20, 10);
}
}