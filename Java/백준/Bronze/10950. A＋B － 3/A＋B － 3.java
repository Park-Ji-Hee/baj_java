import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int t =sc.nextInt();

    	int n =0;
    	while(n<t) {
        	int a =sc.nextInt();
        	int b =sc.nextInt();
    		System.out.println(a+b);
    		n++;
        }

    }
}