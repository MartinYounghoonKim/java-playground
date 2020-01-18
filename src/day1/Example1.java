package day1;

public class Example1 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.printf(
					"%2d %2d %2d %2d %2d %2d %2d%n", 
					i,
					11-i,
					i*2,
					i + (i-1),
					i*i,
					i%3 == 0 ? 3 : i%3,
					i/3 + 1
			);
		}
	}
}
