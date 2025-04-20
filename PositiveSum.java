public class PositiveSum {
	public static void main(String[] args) {
        int[] numbers = {10, -5, 30, -15, 30, -25, 40};
        int sum = 0;
        for(int i=0;i<numbers.length;i++) {
        	int number=numbers[i];
        	if (number < 0)
        	{
        		continue;
        	}
        	sum+=number;
        }
        System.out.println("Sum of Positive number is :"+sum);
}
}
