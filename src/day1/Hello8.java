package day1;

public class Hello8 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if (i+j >=6 && (j-i) <= 4) {
					System.out.print("*");
				} else if (Math.abs(i-j) < 5){
					System.out.print(" ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
        }
	}
}