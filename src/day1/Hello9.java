package day1;

public class Hello9 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("["+i+"," +j+"]");
                if (i==j) {
                	System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}
