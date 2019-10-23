
public class HelloWorld {
    public static void main(String[] args) {
    	int n = 20; 
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i]=(int)(Math.random()*1000);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		for(int i = a.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++)
	        {
	            if( a[j] < a[j+1] )
	            {
	                int tmp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = tmp;
	            }
	        }
	    }
		for(int i = 0; i <  a.length; i++) {
			System.out.print(a[i] + " ");
		}


    }
}