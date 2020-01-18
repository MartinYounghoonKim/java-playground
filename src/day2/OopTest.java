package day2;

class Point {
	int x;
	int y;
	Point () {
		this(0,0);
	}
	Point (int a, int b) {
		this.x = a;
		this.y = b;
	}
	double getDistance (Point p) {
		return getDistance(this.x, this.y, p.x, p.y);
	}
	static double getDistance (Point p1, Point p2) {
		return getDistance(p1.x, p1.y, p2.x, p2.y);
	}
	static double getDistance (int x1, int y1, int x2, int y2) {
		int a = x1 - x2;
		int b = y1 - y2;
		double d = Math.sqrt(a*a+b*b);
		
		return d;
	}
	public String toString () {
		return "x=" + x + ",y=" + y;
	}
}

public class OopTest {
	public static void main(String[] args) {
		Point point1 = new Point(3, 4);
		Point point2 = new Point();
		
		System.out.println(Point.getDistance(0, 1, 0, 1));
		System.out.println(point1.getDistance(point2));
		System.out.println(point1.toString());
	}
}
