public class lab_11_2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Area <length> <breadth>");
            System.exit(0);
        }
        double length = 0;
        double breadth = 0;
        try {
            length = Double.parseDouble(args[0]);
            breadth = Double.parseDouble(args[1]);
            if (length <= 0 || breadth <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid positive numbers for length and breadth.");
            System.exit(0);
        }
        double area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }
}