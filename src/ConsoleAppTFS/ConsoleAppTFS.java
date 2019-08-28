package ConsoleAppTFS;
import java.io.Console;
import java.util.Scanner;

public class ConsoleAppTFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World, Can you share your name with me please?");
		String name;
		Scanner scanInput = new Scanner(System.in);
		name = scanInput.nextLine();
		scanInput.close();
		
        System.out.println("Hello "+name);
	}

}
