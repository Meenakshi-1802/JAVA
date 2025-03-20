import java.lang.*;
class Fruits{
void taste() {
  System.out.println("Fruits have different tastes");
}
}
class Apple extends Fruits {
void taste() {
System.out.println("Apple is sweet");
}
}
class Lemon extends Fruits{
void taste() {
System.out.println("Lemon is sour");
}
}
public class Overriding{
public static void main(String args[]) {
Fruits obj1 = new Fruits();
obj1.taste();
Apple obj2 = new Apple();
obj2.taste();
Lemon obj3 = new Lemon();
obj3.taste();
}
}
