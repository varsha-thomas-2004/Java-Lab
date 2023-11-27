import java.io.*;

class RdfCopy 
{
    public static void main (String args[]) throws IOException
    {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;
        try
        {
            f1 = new FileInputStream("test.txt");
            f2 = new FileOutputStream("cp.txt");
            int c;
            do
            {
                c = f1.read();
                if (c != -1)
                {
                    f2.write((char)c);
                    System.out.println((char)c);
                }
            } while (c != -1);
            System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Exception handled "+e.getMessage());
        }
        finally
        {
            f1.close();
            f2.close();
        }
    }
}
