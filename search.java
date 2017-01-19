import java.util.Scanner;

public class search{
	public static void main(String[] args){
		boolean active = true;
		Scanner input = new Scanner(System.in);
		Engine test = new Engine();

		String word = "";
		while(active){
			System.out.print("Input a word: ");
			word = input.nextLine();
			if(word.isEmpty()){
				active = false;
			}
			System.out.println("Here is your word: " + word);
		}
	}
}