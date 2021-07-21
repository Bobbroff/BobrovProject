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

	    Point p1 = new Point(10,20);
	    Point p2 = new Point(5,1);
	    System.out.println("Растояние между точками на плоскости = " + distance(p1,p2));
    }

	public static double distance (Point p1, Point p2){
		return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
	}

    public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

}