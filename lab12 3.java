
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Matrix");
			int s =0;
			int[][] a = new int [5][5];
			for (int i = 0; i < 5; i++) {
	                    for (int j = 0; j < 5; j++) {
	                    	a[i][j] = (int)(Math.random()*10);
	            	        System.out.print(a[i][j] + "\t");
	            	        s = s + a[i][j];
	                    }
	                    System.out.println();
	                }
			System.out.print("S = " + s);
		}
	}