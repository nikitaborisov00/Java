
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Matrix C:");
			int[][] c = new int [3][3];
			for (int i = 0; i < 3; i++) {
	                    for (int j = 0; j < 3; j++) {
	                    	c[i][j] = (int)(Math.random()*99);
	            	        System.out.print(c[i][j] + "\t");
	                    }
	                    System.out.println();
	                }
			System.out.println("Matrix D:");
			int[][] d = new int [3][3];
			for (int i = 0; i < 3; i++) {
	                    for (int j = 0; j < 3; j++) {
	                    	d[i][j] = (int)(Math.random()*99);
	            	        System.out.print(d[i][j] + "\t");
				}
	                    System.out.println();
			}
			System.out.println("Matrix C+D:");
			int[][] n = new int [3][3];
			for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                	n[i][j] = c[i][j] + d[i][j];
                	System.out.print(n[i][j] + "\t");
                }
                System.out.println();
            }
			System.out.println("Matrix C*D:");
			for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                	n[i][j] = c[i][j]*d[i][j];
                	System.out.print(n[i][j] + "\t");
                }
                System.out.println();
            }
		}
	}
