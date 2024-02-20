abstract class Motor {
    int capacity;
    
    public abstract void run();
    public abstract void consume();
}

class WashingMachine extends Motor {
    int capacity = 7; // set the capacity to 7 kg
    
    public void run() {
        System.out.println("Washing machine is running.");
    }
    
    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
}

public class lab_8_2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("The capacity of the washing machine is " + wm.capacity + " kg.");
    }
}