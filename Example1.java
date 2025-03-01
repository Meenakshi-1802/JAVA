import java.util.*;
class Fruit
{
String name;
int price;
public void get()
{
name = "Apple";
price = 150;
}
public void put()
{
System.out.println("NAME=" + name);
System.out.println("PRICE=" + price);
}
}
class Example1
{
public static void main(String args[])
{
Fruit obj = new Fruit();
obj.get();
obj.put();
obj.name = "Orange";
obj.price = 200;
obj.put();
}
}

