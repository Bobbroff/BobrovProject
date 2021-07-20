package ru.stqa.pft.sandbox;

public class MyFirstProgram {

   public static void main(String[] args) {
	   	hello("world");
	    hello("user");
	    hello("Mikhail");

		Square s = new Square(5);
	    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

	    Rectangle r = new Rectangle(4, 6);
	    System.out.println("Площадь прямугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

	    Point p = new Point(10,5,3,6);
	    System.out.println("Растояние между точками на плоскости = " + p.area());
    }

    public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

}