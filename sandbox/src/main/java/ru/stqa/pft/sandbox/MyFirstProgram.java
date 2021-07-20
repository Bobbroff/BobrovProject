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

	    Point p = new Point(10,12,24,25);
	    System.out.println("Растояние между точками на плоскости = " + distance(p));
    }

	public static double distance (Point p){
		return Math.sqrt((p.y2 - p.y1) * (p.y2 - p.y1) + (p.x2 - p.x1) * (p.x2 - p.x1));
	}

    public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

}