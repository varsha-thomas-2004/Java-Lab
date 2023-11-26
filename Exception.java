/*
Name : Varsha Thomas
Class : CS3B

To demonstrate the usage of try, catch, throws and finally.
*/

import java.util.Scanner;

class Exception
{
    public static void Divide(int a, int b) throws ArithmeticException
    {
        if (b == 0)
        {
            throw new ArithmeticException("Hey, a number cannot be divided by zero.");
        }
        else
        {
            float c = (float) a / b;
            System.out.println("The answer is "+c);
        }
    }
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) 
        {
                System.out.println("Enter two numbers:");
                int a = obj.nextInt();
                int b = obj.nextInt();
                Divide(a, b);
        }
        catch (ArithmeticException ar)
        {
            System.out.println("ArithmeticException : Cannot divide by zero!");
        }
        finally
        {
            System.out.println("EXITTING...");
        }
    }
}