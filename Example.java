import java.util.*;
class Student
{
String name;
int roll;
public void get()
{
name = "Ram";
roll = 10;
}
public void put()
{
System.out.println("NAME="+ name);
System.out.println("ROLL="+ roll);
}
}
class Example
{
public static void main(String args[])
{
Student obj = new Student ();
obj.get();
obj.put();
obj.name = "Jack";
obj.roll = 20;
obj.put();
}
}
