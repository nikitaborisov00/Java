
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Matrix");
			int c = -2, d = 5;
			int[][] a = new int [5][5];
			for (int i = 0; i < 5; i++) {
	                    for (int j = 0; j < 5; j++) {
	                    	a[i][j] = c + (int)(Math.random()*d);
	            	        System.out.print(a[i][j] + "\t");
	                    }
	                    System.out.println();
	        }
			for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                	if (a[i][j] < 0) {
                		System.out.print("["+i+"]"+"["+j+"]  ");
                	}
                	
                }
			}
		}
	}
