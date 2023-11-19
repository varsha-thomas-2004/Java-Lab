/*
Name : Varsha Thomas
Class : CS3B

To understand the concept of abstract classes.
*/

abstract class Shape
{
    abstract void noofSides(); //Only method declaration in abstract classes.
}

class Rectangle extends Shape
{
    void noofSides() //Function definition is done in child classes.
    {
        System.out.println("The number of sides of Rectangle is 4.");
    }
}

class Triangle extends Shape
{
    void noofSides() //Function definition is done in child classes.
    {
        System.out.println("The number of sides of Triangle is 3.");
    }
}

class Hexagon extends Shape
{
    void noofSides() //Function definition is done in child classes.
    {
        System.out.println("The number of sides of Hexagon is 6.");
    }
}

class Abstract
{
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hexa = new Hexagon();
        rect.noofSides();
        tri.noofSides();
        hexa.noofSides();
    }
}