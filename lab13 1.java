
public class HelloWorld {
	public static void main(String[] args) {
    	int n = 10; 
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i]=(int)(Math.random()*100)+1;
			if (a[i]%3 == 0 && a[i]%6 ==0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}