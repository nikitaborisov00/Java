import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Input A: ");
        int a = input.nextInt();
        System.out.print("Input B: ");
        int b = input.nextInt();
        int min = 0, max = 0, nod = 0, nok = 0;
        if (a > b) {
        	min = b;
        	max = a;
        }
        else {
        	max = b;	
        	min = a;
        }
        for (int i = 1; i <=min; i++)
        {
        	if (a%i == 0 && b%i == 0) 
        		if (i > nod)
        			nod = i;
        }
        for (int i = max; i <=max && i !=0; i--) {
        	if (i % a == 0 && i % b == 0)
        		nok = i;
        }
		System.out.println("НОД = "+ nod +" НОК = "+ nok);
	}
}