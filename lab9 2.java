
public class HelloWorld
{
    public static void main(String[] args)
    {
    	int n = 10, sum = 1;
    	for(int i=1;i<=n;i++) {
    		sum = i * sum; 
    	}
    	System.out.println(sum);
    }
}