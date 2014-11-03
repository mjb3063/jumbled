import java.util.*;

public class WordJumbled {
	public static char[] main(char[] array){
		Random rgen = new Random();  // Random number generator			
 
		String word = "";

		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    char temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}

		for(int i = 0; i < array.length; i++)
			word += array[i]);
		return word;


	} // closes main
} // closes class