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
		int e = random.nextInt(100);
		int min = 0, max =0;
		if (a<b&&a<c&&a<d&&a<e)
			min = a;
	    else if (b<a&&b<c&&b<d&&b<e)
	    	min = b;
	    else if (c<a&&c<b&&c<d&&c<e)
	    	min = c;
	    else if (d<a&&d<c&&d<b&&d<e)
	    	min = d;
	    else if (e<a&&e<c&&e<d&&e<b)
	    	min = e;
	    if (a>b&&a>c&&a>d&&a>e)
	    	max = a;
	    else if (b>a&&b>c&&b>d&&b>e)
	    	max = b;
	    else if (c>a&&c>b&&c>d&&c>e)
	    	max = c;
	    else if (d>a&&d>c&&d>b&&d>e)
	    	max = d;
	    else if (e>a&&e>c&&e>d&&e>b)
	    	max = e;
	    
	    System.out.println(min + " " + max);
	}

}