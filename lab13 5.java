import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Input Radius: ");
        int a = input.nextInt();
        System.out.print("Input Height: ");
        int b = input.nextInt();
        double v = 0;
        v = (3.14*(a*a)*b)/3;
		System.out.println("Voluem = "+ v);
	}
}