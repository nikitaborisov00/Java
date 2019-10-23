public class HelloWorld
{
	public static void main(String[] args){
		int n = 10, k = 1;
		int[] A = new int[n];
		for(int i = 0;i<A.length;i++){
			A[i]=k;
			k = k +2;
		}
		for(int i = 0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
}