
public class HelloWorld {
	public static void main(String[] args) {
    	int n = 10;
    	double s = 0; 
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i]=(int)(Math.random()*100)+1;
			s += a[i];
		}
		s = s/n;
		System.out.print(s);
	}
}