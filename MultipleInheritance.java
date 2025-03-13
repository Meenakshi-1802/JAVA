import java.lang.*;
interface Animal
{
public void eat();
}
interface Bird
{
public void fly();
}
class Bat implements Animal,Bird
{
public void eat()
{
System.out.println("Bat eats");
}
public void fly()
{
System.out.println("Bat fly");
}
}
class MultipleInheritance
{
public static void main(String args[])
{
Bat b = new Bat();
    b.eat();
    b.fly();
}
}