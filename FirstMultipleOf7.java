public class FirstMultipleOf7 {
    public static void main(String[] args) {
        int[] numbers = {14, 22, 25};

        for (int number : numbers) {
            if (number % 7 == 0) {
                System.out.println("First multiple of 7 is: " + number);
                return; 
            }
        }

        System.out.println("No multiples of 7 found.");
    }
}
