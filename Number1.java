import java.util.Scanner;
class Number {
    private int[] arr;
    private int n;
    public void read() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = input.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }
    public void swap() {
        int min = 0, max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
    }
    public void display() {
        System.out.println("The modified array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class Number1 {
    public static void main(String[] args) {
        Number num = new Number();
        num.read();
        num.swap();
        num.display();
    }
}