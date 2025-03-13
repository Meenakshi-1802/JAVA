import java.lang.*;
class Animal
{
public void eat()
{
System.out.println("Animal eats");
}
}
class Mammal extends Animal
{
public void breath()
{
System.out.println("Mammal breathes");
}
}
class Dog extends Mammal
{
public void bark()
{
System.out.println("Dog Barks");
}
}
class Multilevel
{
public static void main(String args[])
{
Dog d = new Dog();
    d.eat();
    d.breath();
    d.bark();
}
}
