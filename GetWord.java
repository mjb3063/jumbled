import java.util.*;



public class GetWord {
	public static String main (String [] wordBank) {

		final int WORD_BANK_LENGTH = 10000;
		int wordISGood = 0; // 0 is repeat ------ 1 is go
		String word = "";

		Random randomNumber = new Random ();
		do {
			int arrayLength = WORD_BANK_LENGTH;
			int wordNumber = randomNumber.nextInt((WORD_BANK_LENGTH));
			word = wordBank[(wordNumber)];
			if (word.equals(null))
				wordISGood = 0;
			else
				wordISGood = 1;
		} while (wordISGood == 0);

		// System.out.println(word); // for testing purposes only

		return word;
	} // closes main
}// closes class