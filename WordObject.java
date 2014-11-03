import java.util.*;
import javax.swing.*;


public class WordObject {
	
	Scanner keyboard = new Scanner (System.in);
	Random random = new Random ();

	String word;
	String jumbled;
	String getAHint = " ";
	char [] wordHint;
	int ptsPossible = 10;

	public WordObject (String w, String j, char [] wh){
		word = w;
		jumbled = j;
		wordHint = wh;
	}

	public boolean getGuess () {
		String gw = JOptionPane.showInputDialog(this.toString() + "\nWhat is your guess?");
		return this.word.equals(gw);
	}

	public void getHint () {
		int hintPlace = random.nextInt((wordHint.length));
		wordHint[hintPlace] = word.charAt(hintPlace);
		//for (int j = 0; j < wordHint.length; j++){
			//char add = wordHint[j];
			//getAHint = getAHint + add;
		//} // closes for loop
		//return wordHint;
	} // closes get a hint

	public String toString () {
		return "Points possible: " + ptsPossible + "\nYour word is: " + jumbled + "\nHint: " + this.wordHintToHint() + "\n";
	} // closes toString

	public String correctGuess (){
		return "\n\nCORRECT!!!\n\nYou earned " + ptsPossible + " points!";
	} // closes correctGuess

	public String incorrectGuess () {
		return "That guess was incorrect, you can now only get " + ptsPossible + " points.";
	}

	public void getTempScoreHint () {
		ptsPossible = (ptsPossible / 2);
	}

	public void getTempScoreIncorrectGuess () {
		ptsPossible --;
	}

	public String wordHintToHint(){
		String hint = "";
		for (int i = 0; i < wordHint.length; i++){
			hint += wordHint[i];
		}//closes for
		return hint;
	} //  closes worndHintToHint

	public boolean testScore(){
		return (ptsPossible == 0);
	}

	public int getPoints () {
		return ptsPossible;
	}

	public WordObject () {} // just to compile



} // closes WordObject


