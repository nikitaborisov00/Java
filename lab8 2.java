import java.util.Random;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int max; 
		int n=0;
		Random random = new Random();
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		int c = random.nextInt(100);
		int d = random.nextInt(100);
		
		if( a > b && a > c && a > d ){
	         max = a;
	      }else if( b > a && b > c && b > d ){
	    	  		max = b;
	            }else if( c > a && c > b && c > d ){
	            		max = c;
	                  }else{
	                	  max = d;
	                  }
		if(a==max) {
			n=n+1;
		}else if(b==max) {
			n++;
		}else if(c==max){
			n++;
		}else if(d==max) {
			n++;
		}
		System.out.print(n);
	}
}