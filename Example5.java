interface Animal
{ public void makeSound();
}
class Dog implements Animal
{
public void makeSound()
{
System.out.println("Dog is Barking");
}
}
class Example5
{public static void main(String args[])
{
Dog myDog = new Dog();
myDog.makeSound();
}
}
