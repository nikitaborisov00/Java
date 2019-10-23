
public class HelloWorld {
    public static void main(String[] args) {
    	int n = 5; 
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i]=(int)(Math.random()*100)+1;
			System.out.print(a[i] + " ");
		}
		System.out.println("");
        int max = a[0], min = a[0], imax = 0, imin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
        }
        a[imin] = max;
        a[imax] = min;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}