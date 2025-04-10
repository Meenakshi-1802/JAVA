import java.io.FileOutputStream;
import java.io.IOException;
class ByteStreamWrite {
    public static void main(String[] args) {
        String text = "Hello, Byte Stream";
        
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Data written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
