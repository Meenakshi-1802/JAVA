import java.io.FileInputStream;
import java.io.IOException;
public class ByteStreamRead
{
public static void main(String args[])
{
String filename = "example.txt";
 try (FileInputStream fis = new FileInputStream(filename)) 
{
int byteData;
while((byteData = fis.read()) != -1)
{
System.out.print((char) byteData);
}
}catch(IOException e) 
{
e.printStackTrace();
}
}
}