import java.util.Scanner;
class IntegerCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int n = number;
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        
        System.out.println("Number of digits in "+number+" are "+count);
        
    }
    
}