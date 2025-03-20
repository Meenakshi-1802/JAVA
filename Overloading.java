import java.lang.*;
class Overloading{
    void display(int a) {
        System.out.println("Number: " + a);
    }
    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display(10);       
        obj.display(10, 20); 
    }
}
