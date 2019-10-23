
public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Matrix");
			int s = 5;
			int[][] a = new int [s][s];
			for (int i = 0; i < 5; i++) {
	                    for (int j = 0; j < 5; j++) {
	                    	a[i][j] =(int)(Math.random()*100);
	            	        System.out.print(a[i][j] + "\t");
	                    }
	                    System.out.println();
	        }
			for (int k = 0; k < s; k++) {
                for (int i = 0; i < s; i++) {
                	for (int j = s - 1; j > i; j--){
                		if (a[k][j] < a[k][j-1]) {
                			int tmp = a[k][j];
                			a[k][j] = a[k][j-1];
                			a[k][j-1] = tmp;
                		}
                	}
                	
                }
			}
			System.out.println("Matrix");
			for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
        	        System.out.print(a[i][j] + "\t");
                }
                System.out.println();
    }
		}
	}
