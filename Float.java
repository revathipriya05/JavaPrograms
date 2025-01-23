import java.util.Scanner;
class Float {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
float n1 = sc.nextFloat();
System.out.println("Enter the second number:");
float n2 = sc.nextFloat();
if((int)(n1*1000)==(int)(n2*1000))
{
System.out.println("The numbers are equal");
}
else
{
System.out.println("The numbers are not equal");
}
sc.close();
}
}


