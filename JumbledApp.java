import java.util.*;
import javax.swing.*;
import java.io.*;


public class JumbledApp {

	public static void main (String [] arg) throws IOException {

		int loop = 0; // 0 is to continue the loop; 1 is to not contiune the guess/hint/new/quit loop
		char gameContinue = 0; //0 is to continue the game, 1 is to not continue the game
		int totalScore = 0;


		String [] wordBank = LoadWordBank.main(); 
		do {
			JOptionPane.showMessageDialog(null, "Getting your Word...");
			String word = GetWord.main(wordBank);
			//System.out.println(word); // for testing/debugging
			char [] wordNotJumbled = arrayWordNotJumbled(word);
			String jumbled = WordJumbled.main(wordNotJumbled);
			char [] hintArray = ArrayHint.main(word);



			WordObject theWord = new WordObject (word, jumbled, hintArray);
			do {
				char nextMove = JOptionPane.showInputDialog(theWord.toString() + "\nWhat would you like to do? \n(G)uess a word? \nGet a (H)int, \nGet a (N)ew word, or \n(Q)uit").charAt(0);
				switch (nextMove){
					case 'g':
					case 'G':
						boolean bool = theWord.getGuess();
						if (bool == true){
							theWord.correctGuess();
							loop = 1;
						}
						else {
							theWord.getTempScoreIncorrectGuess();
							theWord.incorrectGuess();
							loop = 0;
						}
						break;
					case 'h':
					case 'H':
						loop = 0;
						theWord.getHint();
						theWord.getTempScoreHint();
						break;
					case 'n':
					case 'N':
						loop = 1;
						JOptionPane.showMessageDialog(null, "You picked new word");
						break;
					case 'Q':
					case 'q':
						loop = 1;
						JOptionPane.showMessageDialog(null, "You picked quit");
						break;
					default:
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
				} //closes switch
				if (theWord.testScore() == true) {
					JOptionPane.showMessageDialog(null, "Sry you have no more possible points!!  \nYour word was: " + word);
					loop = 1;
				} // closes if
			} while (loop == 0); // closes switch

		int pts = theWord.getPoints();
		totalScore += pts;
		do {
			gameContinue = JOptionPane.showInputDialog("Would you like to get another word? (Y)es or (N)0").charAt(0);
		} while (gameContinue != 'y' && gameContinue != 'Y' && gameContinue != 'n' && gameContinue != 'N'); 	

		} while (gameContinue == 'Y' || gameContinue == 'y');// closes outter do statement	
		JOptionPane.showMessageDialog(null, "Thank you for playing JuMbLeD!\nYour final score was: " + totalScore);
	} // closes main

	public static char [] arrayWordNotJumbled(String word){
		char [] notJumbled = new char [word.length()];
		for (int i = 0; i < word.length(); i++) {
			notJumbled [i] = word.charAt(i);
			//System.out.println(notJumbled[i]); // for testing and debugging
		} // closes for
		return notJumbled;
	} // closes arrayWordNotJumbled
		


} //closes class






