import java.util.Scanner;

public class EvenNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();
        
        int count = 0;
        int i = 1;
        
        while (i <= N) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        
        System.out.println("Total even numbers from 1 to " + N + " are: " + count);
    }
}