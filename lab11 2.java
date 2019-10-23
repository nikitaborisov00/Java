import java.util.Arrays;
public class HelloWorld {
    public static void main(String[] args) {
    	String[] brands = new String[] {"BMW","MINI", "Smart", "Fiat", "Ford", "Jeep", "GMC"}; 

    	Arrays.sort(brands);
    	for(int i = 0; i <  brands.length; i++) {
    		System.out.print(brands[i] + "  ");
    	}

		for(int i = 0; i <  brands.length; i++) {
			System.out.print(brands[i] + " ");
		}


    }
}