import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		int r;
		if ( y%4==0 && y%100!=0 || y%400==0 ) {
			r = 1;
		} else {
			r = 0;
		}
		
		System.out.println(r);

	}

}