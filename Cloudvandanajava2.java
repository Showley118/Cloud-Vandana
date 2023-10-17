package CloudVandana;


	import java.util.HashMap;

	public class Cloudvandanajava2 {
	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanNumerals = new HashMap<>();
	        romanNumerals.put('I', 1);
	        romanNumerals.put('V', 5);
	        romanNumerals.put('X', 10);
	        romanNumerals.put('L', 50);
	        romanNumerals.put('C', 100);
	        romanNumerals.put('D', 500);
	        romanNumerals.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currentValue = romanNumerals.get(s.charAt(i));
	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	            prevValue = currentValue;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "IX";
	        int integerValue = romanToInt(romanNumeral);
	        System.out.println("The integer representation of " + romanNumeral + " is: " + integerValue);
	    }
	}



