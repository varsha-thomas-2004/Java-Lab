import java.io.*;
import java.util.Scanner;
import java.lang.Exception;
class FileWriterExample
{
    public void fw()
    {
        try
        {
            FileWriter fw = new FileWriter("abc.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the input:");
            char s = sc.next(".").charAt(0);
            fw.write(s);
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Correct "+e);
        }
        System.out.println("Success...");
    }
}

class FileReaderExample
{
    public void fr()
    {
        try
        {
            FileReader fr = new FileReader("abc.txt");
            int i;
            while ((i = fr.read()) != -1)
            {
                System.out.println((char)i);
                fr.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("In reading met with "+e);
        }
    }
}

class FileOperations
{
    public static void main(String args[])
    {
        FileWriterExample f1 = new FileWriterExample();
        FileReaderExample f2 = new FileReaderExample();
        f1.fw();
        f2.fr();
    }
} 
