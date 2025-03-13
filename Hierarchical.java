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
class Cat extends Animal
{
public void meow()
{
System.out.println("Cat Meows");
}
}
class Hierarchical
{
public static void main(String args[])
{
Dog d = new Dog();
Cat c = new Cat();
    d.bark();
    d.eat();
    c.meow();
    c.eat();
}
}