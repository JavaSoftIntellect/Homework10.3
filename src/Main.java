import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text here: ");
		String text = in.nextLine();
		System.out.println("Enter a word to count: ");
		String word = in.nextLine();
		int theWord = text.indexOf(word);
		int count = 0;
		while (theWord != -1) {
			count++;
			text = text.substring(theWord + 1);
			theWord = text.indexOf(word);
		}if (count==1){
			System.out.println("We met the word "+word+" once in your text!"); 
		}else
		System.out.println("We met the word " + word + " " + count+" times in your text.");
	}
}