public class HelloWorld
{
	public static void main(String[] args){
		int n = 10;
		int[] A = new int[n];
		for(int i = 0;i<A.length;i++){
			A[i]=(int)(Math.random()*100)+1;
		}
		int max = A[0];
		for(int i = 1;i<A.length;i++){
			if(A[i]>A[i-1]){
				max=A[i];
			}
		}
		System.out.println(max);
	}
}