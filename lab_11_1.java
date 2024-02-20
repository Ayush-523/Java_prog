public class lab_11_1 {
    private double celsius;
    private double fahrenheit;
    
    public void Temperature(double value, String unit) throws NumberFormatException {
        if (unit.equals("C")) {
            celsius = value;
            fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
        } else if (unit.equals("F")) {
            fahrenheit = value;
            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        } else {
            throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }
    
    public double getCelsius() {
        return celsius;
    }
    
    public double getFahrenheit() {
        return fahrenheit;
    }
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Temperature <value> <unit>");
            System.exit(1);
        }
        
        try {
            double value = Double.parseDouble(args[0]);
            String unit = args[1];
            Temperature temp = new Temperature(value, unit);
            System.out.printf("%.1f°C = %.1f°F\n", temp.getCelsius(), temp.getFahrenheit());
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature value: " + args[0]);
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}