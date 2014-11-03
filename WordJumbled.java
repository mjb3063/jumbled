import java.util.*;

public class WordJumbled {

	public static String main(char [] wordNotJumbled) {
	String jumbled = "";
	Random random2 = new Random ();

		for (int i = 0; i < wordNotJumbled.length; i++) {

			int j = random2.nextInt(wordNotJumbled.length);

			//System.out.println(i + " " + j); // for testing and debugging
			
			char temp = wordNotJumbled[i];
			wordNotJumbled [i] = wordNotJumbled [j];
			wordNotJumbled [j] = temp;
		} // closes for loop
		
		for (int i = 0; i < wordNotJumbled.length; i++){
			jumbled += wordNotJumbled[i];
			System.out.println(jumbled); // for testing and debugging
		}
		return jumbled;
	
	} // closes main
} //closes wordJumbled
