

public class ArrayHint {
	public static char [] main (String word) {

		char [] hintArray = new char [word.length()];

		for (int i = 0; i < word.length(); i++){
			hintArray [i] = '-';
		}

		return hintArray;

	} // closes main
} // closes ArrayHint


