
public class HelloWorld
{
    public static void main(String[] args)
    {
    	int n = 10, sum = 1, i = 1;
    	while(i <= n) {
    		sum = i * sum;
    		i++;
    	}
    	System.out.println(sum);
    }
}