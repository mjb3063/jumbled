import java.util.*;
import java.io.*;
import java.util.Scanner;

public class LoadWordBank {
	public static String [] main () throws IOException {

		final int NUMBER_OF_WORDS = (10000);
		int i;
		String garbageIn;

		//open file
		File file = new File ("wordbank.txt");
		Scanner inputFile = new Scanner(file);

		//read the file
		//garbageIn= inputFile.nextLine();
		//int arrayLength = Integer.parseInt(temp);
		String [] wordBank = new String[NUMBER_OF_WORDS];

		for (i = 0; i < NUMBER_OF_WORDS; i++) {
			garbageIn = inputFile.nextLine();
			wordBank[i] = garbageIn;
			//System.out.println("i = " + i + " word is " + wordBank[i]);
		} // closes while

		//closes file
		inputFile.close();

		return wordBank;

	} // closes main
} // closes LoadWordBank