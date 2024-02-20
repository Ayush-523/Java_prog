import java.util.Scanner;

abstract class Employee {
    double basic;

    public Employee(double basic) {
        this.basic = basic;
    }

    public abstract double earnings();
    public abstract double deductions();
    public abstract double bonus();
}

class Manager extends Employee {
    public Manager(double basic) {
        super(basic);
    }

    @Override
    public double earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    @Override
    public double deductions() {
        return 0.12 * basic;
    }

    @Override
    public double bonus() {
        return 0.0;
    }
}

class Substaff extends Manager {
    public Substaff(double basic) {
        super(basic);
    }

    @Override
    public double bonus() {
        return 0.5 * basic;
    }
}

public class lab_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Substaff(basic);

        double earnings = emp.earnings();
        double deductions = emp.deductions();
        double bonus = emp.bonus();

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);

        double salary = earnings - deductions + bonus;
        System.out.println("Net Salary: " + salary);
    }
}