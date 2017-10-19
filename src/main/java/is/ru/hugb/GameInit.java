package is.ru.hugb;

public class GameInit{

	public String getGreeting() {
        return "Hello world.";
    }

	public static void main(String[] args){
		System.out.println(new GameInit().getGreeting());		
	}
}