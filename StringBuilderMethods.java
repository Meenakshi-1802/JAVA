public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);  // Output: Hello World

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);  // Output: Hello Java World

        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);  // Output: Hello C++a World

        sb.delete(6, 9);
        System.out.println("After delete: " + sb);  // Output: Hello World

        sb.reverse();
        System.out.println("After reverse: " + sb);  // Output: dlroW olleH

        System.out.println("Capacity: " + sb.capacity());  // Output: 21

        System.out.println("Length: " + sb.length());  // Output: 11

        System.out.println("Character at index 0: " + sb.charAt(0));  // Output: d

        System.out.println("Substring from index 0 to 5: " + sb.substring(0, 5));  // Output: dlroW 
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb);  // Output: HlroW olleH
    }
}
