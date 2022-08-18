/**
 * 
 */
package ClassObjects;

/**
 * @author Covenant Visions
 *
 */
public class TextProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countWords("I love Thamara");
		reverseString("Thamara Ogwuche");
		addSpaces("Hello!JoeOgwuche");
	}
	/**
	 * Split text into array and tokenize it
	 * @param word
	 * @return
	 */
	public static void countWords(String text) {
		var word = text.split(" ");
		int noOfWords = word.length;
		
		String message = String.format("There are %d number of words", noOfWords);
		System.out.println(message);
		for (int i=0; i<= noOfWords-1; i++) {
			System.out.println(word[i]);
		}
		
	}
	public static void reverseString(String text) {
		for(int i = text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i)); 
		}
	}
	public static void addSpaces(String text) {
		var modifyText = new StringBuilder(text);
		for(int i= 0; i<= text.length(); i++) {
			if(i!=0 && Character.isUpperCase(modifyText.charAt(i))) {
				modifyText.insert(i, " ");
				i++;
			}
		}
		System.out.println(modifyText);
	}

}
