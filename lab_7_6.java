class Programming {
   
    // Creating method m1 for class Programming
    public void m1()
    {
      System.out.println("Programming");
    }
}
class DP extends Programming {
   
    // Creating method m2 for class DP
    public void m2()
    {
      System.out.println("DP");
    }
}
public class lab_7_6
 {
   
    public static void main(String[] args)
    {
        // Creating Obj for Class DP and
        // Calling both m1 from class programming
        // And calling m2 from class DP respectively.
        DP obj = new DP();
        obj.m2();
        obj.m1();
    }
}