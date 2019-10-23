
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cat ourcat= new Cat();
		ourcat.eat();
		ourcat.sleep();
		String say = ourcat.speak("Play with me");
		System.out.println(say);
	}

}