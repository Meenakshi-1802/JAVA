import java.util.*;
public class Modulo
{
public static void main(String args[])
{
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of x & y");
x = sc.nextInt();
y = sc.nextInt();
z = x % y;
System.out.println("mod="+z);
}
}