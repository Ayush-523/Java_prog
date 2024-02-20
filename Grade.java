import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90){
        System.out.println("The grade is O");
        }
        else if(marks>79){
            System.out.println("The grade is E");
        }
        else if(marks>69){
            System.out.println("The grade is A");
        }
        else if(marks>59){
            System.out.println("The grade is B");
        }
        else if(marks>49){
            System.out.println("The grade is C");
        }
        else if(marks>39){
            System.out.println("The grade is D");
        }
        else if(marks<40){
            System.out.println("Fail");
        }
    }
}