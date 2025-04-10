import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteExample
{
 public static void main(String[]args)
{
 String filePath = "output,txt";
 try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
{
 writer.write("Hello,World!");
 writer.newLine();
 writer.write("File handling in Java is straightforward.");
}
 catch (IOException e)
{ 
 System.err.println("Error writing file: " + e.getMessage());
}
}
}