import java.util.*;
public class DayOfWeek
{
public static void main(String args[])
{
int days;
String dayOfWeek;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number(1-7):");
days = sc.nextInt();
switch (days) {
       case 1:
           dayOfWeek = "Monday";
       break;
       case 2:
                dayOfWeek = "Tuesday";
       break;
       case 3:
                dayOfWeek = "Wednesday";
       break;
       case 4:
                dayOfWeek = "Thursday";
       break;
       case 5:
                dayOfWeek = "Friday";
       break;
       case 6:
                dayOfWeek = "Saturday";
       break;
       case 7:
                dayOfWeek = "Sunday";
       break;
            default:
                dayOfWeek = "Invalid input! Please enter a number between 1 and 7.";
                break;
        }
System.out.println(dayOfWeek);
}
}