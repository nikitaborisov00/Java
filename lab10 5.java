public class HelloWorld
{
	public static void main(String[] args){
		int n = 10, max;
		double sum = 0;
		int[] A = new int[n];
		for(int i = 0;i<A.length;i++){
			A[i]=(int)(Math.random()*100)+1;
		}
		for(int i = 0;i<A.length;i++){
			sum = sum +A[i];
		}
		max = A.length;
		sum = sum / max;
				System.out.println(sum);
	}
}