package day2;

public class OopTest2 {
	public static void main(String[] args) {
		Point1 point = new Point1();
		Point3D point3D = new Point3D(1); 
		
		System.out.println(point.toString());
		System.out.println(point3D.toString());
		System.out.println(point3D.toString());
	}
}

class Point1 {
	int x;
	int y;
	Point1 () {
		this(1,1);
	}
	Point1 (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals (Object obj) {
		if (!(obj instanceof Point1)) {
			return false;
		} 
		if (((Point1) obj).x != this.x || ((Point1) obj).y != this.y) {
			return false;
		}
		return true;
	}
	public String toString () {
		return "x=" + this.x + ",y=" + this.y;
	}
}

class Point3D extends Point1 {
	int z;
	Point3D () {
		super();
	}
	Point3D (int z) {
		super();
		this.z = z;
	}
	Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString () {
		return super.toString() + ",z=" + this.z;
	}
}