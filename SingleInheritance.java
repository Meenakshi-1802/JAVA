import java.lang.*;
class Animal
{
public void eat()
{
System.out.println("Animal eats");
}
}
class Dog extends Animal
{
public void bark()
{ 
System.out.println("Dog Barks");
}
}
class SingleInheritance
{
public static void main(String args[])
{
Dog d = new Dog();
    d.eat();
    d.bark();
}
}