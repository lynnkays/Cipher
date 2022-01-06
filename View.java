import java.util.*;

public class View {
	private Scanner s;
	public View() {
		s = new Scanner(System.in);
	} 

	public String getMessage() {
		String input = " ";
		System.out.print("Enter a message: ");
		input  = s.nextLine();
		return input;
	}

	public int getKey() {
		int num = 0;
		
		try {
			System.out.print("Enter a number from 0 to 25: ");
			String input = s.nextLine();
			num = Integer.parseInt(input);			
		} catch (Exception ex) {
			System.out.println("Error: Input not an integer.");
		}
		return num;
	} 

	public void displayResult(String msg) {
		System.out.println(msg);
	} 	
} 