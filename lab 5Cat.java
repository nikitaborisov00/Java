
public class Cat {
	
	private int weight; 
	private String name; 
	private String color; 

	public void sleep(){
		System.out.print("Sleeping zz-z-z-z...\n");
	 }
	
	public String speak(String words){ 
		String phrase = words + "...mauu...\n";
		return phrase;
	}
	
	public void eat(){
	 	System.out.print("Eating...\n");
	 }
}
