import java.util.Scanner;
public class Magicnum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to check if it's a magic number: ");
	        int num = scanner.nextInt();
	        int original = num;

	        while (num > 9) {
	            int sum = 0;
	            while (num != 0) {
	                sum += num % 10;
	                num = num / 10;
	            }
	            num = sum;
	        }

	        if (num == 1) {
	            System.out.println(original + " is a Magic Number!");
	        } else {
	            System.out.println(original + " is NOT a Magic Number.");
	        }

	        scanner.close();
	    }
	}
