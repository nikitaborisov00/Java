import java.util.Random;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int c = random.nextInt(100);
		int d = random.nextInt(100);
		
		if( a < b && a < c && a < d ){
	         System.out.print(a);
	      }else if( b < a && b < c && b < d ){
	               System.out.print(b);
	            }else if( c < a && c < b && c < d ){
	                     System.out.print(c);
	                  }else{
	                     System.out.print(d);
	                  }
	}

}