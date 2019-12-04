package strings;

import javax.swing.JOptionPane;

/* When you need to change the contents of a string, the old
 string goes to the garbage collector, and new memory is 
 allocated for the changed string. 
 
 Instead of eating up memory by changing strings, we can 
 use a StringBuffer. So we can change StringBuffers without
 allocating new memory every time.
 
 *However, by using replaceAll we can avoid creating many strings
 *in a for loop in the first place.
 */


public class ReplaceVowels {

	public static void main(String[] args) {
		char letter;
		String inSentence = JOptionPane.showInputDialog("Sentence:");
//		StringBuffer tempStringBuffer = new StringBuffer(inSentence);
//		int numberOfCharacters = tempStringBuffer.length();
//		
//		for(int i=0; i<numberOfCharacters; i++) {
//			letter = tempStringBuffer.charAt(i);
//			if(		letter == 'a' || letter == 'A' ||
//					letter == 'e' || letter == 'E' ||
//					letter == 'i' || letter == 'I' ||
//					letter == 'o' || letter == 'O' ||
//					letter == 'u' || letter == 'U' ) {
//				tempStringBuffer.setCharAt(i, 'X');
//			}
//		}
		String replaced = inSentence.replaceAll("[aeiouAEIOU]", "X");
		JOptionPane.showMessageDialog(null, replaced);
//		JOptionPane.showMessageDialog(null, tempStringBuffer);
	}

}
