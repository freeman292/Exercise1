import java.util.Scanner;

public class HelloUser{

	String userName;
	
	public void greetUser(){
		System.out.println("Please enter your name: ");
		Scanner user_input = new Scanner(System.in);
		userName = user_input.next();
		System.out.println("Hello "+userName+"!");
	}
}

