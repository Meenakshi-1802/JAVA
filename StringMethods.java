public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println("Length: " + str.length());
        System.out.println("Character: " +str.charAt(1));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Replace: " + str.replace("World", "Java"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Contains 'Hello': " + str.contains("Hello"));
    }
}
