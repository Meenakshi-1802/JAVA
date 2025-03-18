// Parent class
class Parent {
    // Constructor of Parent class
    Parent() {
        System.out.println("From Parent class");
    }

    // Method of Parent class
    void display() {
        System.out.println("Method of Parent");
    }
}

// Child class inheriting Parent class
class Child extends Parent {
    // Constructor of Child class
    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("From Child class");
    }

    // Method of Child class
    void show() {
        super.display(); // Calls Parent class method
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String args[]) {
        Child c = new Child(); // Object creation
        c.show(); // Calls show() which invokes Parent's display()
    }
}