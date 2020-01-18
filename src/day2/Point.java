package day2;

class Point11 {
	int x;
	int y;
	Point11 () {
		this(0,0);
	}
	Point11 (int a, int b) {
		this.x = a;
		this.y = b;
	}
	// Q1. 두 점의 거리를 구해서 반환하는 함수를 작성하세요.
	static double getDistance (int x1, int y1, int x2, int y2) {
		int a = x1 - x2;
		int b = y1 - y2;
		double d = Math.sqrt(a*a+b*b);
		
		return d;
	}
	// Q2. 위의 메소드를 오버로딩해서 getDistance(day2.Point p1, day2.Point p2)
	static double getDistance (Point11 p1, Point11 p2) {
		return getDistance(p1.x, p1.y, p2.x, p2.y);
		
	}
	// Q3. 위의 메소드를 오버로딩해서 getDistance(day2.Point P)
	double getDistance (Point11 p) {
		return getDistance(this.x, this.y, p.x, p.y);	
	}
}
