import java.util.Scanner;
class GreatestNumber{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter First number:");
int a = sc.nextInt();
System.out.println("Enter Second number:");
int b = sc.nextInt();
System.out.println("Enter Third number:");
int c = sc.nextInt();
if(a>b && a>c)
{
System.out.println(a+ "is Largest number");
}
else if(b>a && b>c)
{
System.out.println(b+ "is Largest number");
}
else
{
System.out.println(c+ "is Largest number");
}
}
}

