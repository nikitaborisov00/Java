
public class HelloWorld
{
	public static void main(String[] args) {

        String searchMe = "Мама мыла раму";
        int max = searchMe.length();
        char symb = 'а';
        boolean find = false;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == symb) {
                find = true;
                break;
            }

        }
        if (find)
            System.out.println("Символ '" + symb + "' найден в строке");
        else
            System.out.println("Символ '" + symb + "' не найден в строке");

    }
}
	