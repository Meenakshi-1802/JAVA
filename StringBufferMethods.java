import java.lang.*;

public class StringBufferMethods{
    public static void main(String args[]) {

        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" World");
        System.out.println("After append: " + sbf);  // Output: Hello World

        sbf.insert(5, " Java");
        System.out.println("After insert: " + sbf);  // Output: Hello Java World

        sbf.replace(6, 10, "C++");
        System.out.println("After replace: " + sbf);  // Output: Hello C++a World

        sbf.delete(6, 9);
        System.out.println("After delete: " + sbf);  // Output: Hello World

        sbf.reverse();
        System.out.println("After reverse: " + sbf);  // Output: dlroW olleH

        System.out.println("Capacity: " + sbf.capacity());  // Output: 27

        System.out.println("Length: " + sbf.length());  // Output: 11

        System.out.println("Character at index 0: " + sbf.charAt(0));  // Output: d

        System.out.println("Substring from index 0 to 5: " + sbf.substring(0, 5));  // Output: dlroW

        sbf.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sbf);  // Output: HlroW olleH

        sbf.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sbf.capacity());  // Output: 70

        sbf.trimToSize();
        System.out.println("Capacity after trimToSize: " + sbf.capacity());  // Output: 11
    }
}
