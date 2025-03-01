import java.util.*;
public class IfElseIf
{
public static void main(String args[])
{
int marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Marks:");
marks = sc.nextInt();
if(marks > 90){
  System.out.println("A++");
}else if(marks > 80){
  System.out.println("A+");
}else if(marks > 70){
  System.out.println("A");
}else if(marks > 60){
  System.out.println("B+");
}else if(marks > 50){
  System.out.println("B");
}else{
System.out.println("Try to Improve");
}
}
}