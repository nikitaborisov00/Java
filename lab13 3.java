import java.util.Scanner;
import static java.lang.Math.*;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = in.nextInt();
        System.out.print("Input B: ");
        int b = in.nextInt();
        int s = 0;
        double c = 0, p = 0;
        s = (a*b)/2;
        c = sqrt(pow(a, 2)*pow(b, 2));
        p = a+b+c;
		System.out.println("S = " + s);
		System.out.println("P = " + p);
	}
}