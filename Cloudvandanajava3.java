package CloudVandana;

public class Cloudvandanajava3 {

	    public static boolean isPangram(String input) {
	        // Assuming the input string is in lowercase
	        input = input.toLowerCase();
	        // Create a boolean array to mark the presence of characters
	        boolean[] alphabetPresence = new boolean[26];
	        // Iterate through the input string and mark characters as present
	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                int index = c - 'a';
	                alphabetPresence[index] = true;
	            }
	        }
	        // Check if all characters from 'a' to 'z' are present
	        for (boolean present : alphabetPresence) {
	            if (!present) {
	                return false; // If any character is missing, it's not a pangram
	            }
	        }
	        return true; // All characters are present, it's a pangram
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        boolean result = isPangram(input);
	        if (result) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	}



