import java.util.Scanner;

interface Sports
{
    final double sportwt = 6.0;
    abstract void putwt();
}

class Student
{
    int rollno;
    Scanner obj = new Scanner(System.in);
    void getNumber()
    {
        System.out.print("Enter the roll number: ");
        rollno = obj.nextInt();
    }
    void putNumber()
    {
        System.out.println("Rollno.: "+rollno);
    }
}

class Test extends Student
{
    double term1, term2;
    Scanner obj = new Scanner(System.in);
    void getMarks()
    {
        System.out.print("Enter term 1 marks: ");
        term1 = obj.nextDouble();
        System.out.print("Enter term 2 marks: ");
        term2 = obj.nextDouble();
    }
    void putMarks()
    {
        System.out.println("Term 1 = "+term1);
        System.out.println("Term 2 = "+term2);
    }
}

class Results extends Test implements Sports 
{
    public void putwt()
    {
        System.out.println("Sports weightage = "+sportwt);
    }
    public static void main(String[] args) 
    {
        Results res = new Results();
        res.getNumber();
        res.getMarks();
        System.out.println("Marks obtained");
        res.putNumber();
        res.putMarks();
        res.putwt();
        System.out.println("Total score = "+(res.term1 + res.term2 + sportwt));
    }
}
