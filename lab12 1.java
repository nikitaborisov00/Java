
public class HelloWorld {
		public static void main(String[] args) {
			int[][] a = new int [5][6];
			for (int i = 0; i < 5; i++) {
	                    for (int j = 0; j < 6; j++) {
	                    	a[i][j] = (int)(Math.random()*99);
	            	        System.out.print(a[i][j] + "\t");
	                    }
	                    System.out.println();
	                }
					System.out.println(" ");
			for (int i = 2; i <= 2; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.print(a[i][j] + "\t");
				}
			}
		}
	}
