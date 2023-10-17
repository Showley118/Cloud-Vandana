package CloudVandana;
	
	import java.util.Random;

	public class Cloudvandanajava1 {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(array);
	        
	        // Print shuffled array
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    // Fisher-Yates shuffle algorithm
	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random random = new Random();
	        for (int i = n - 1; i > 0; i--) {
	            // Generate a random index between 0 and i (inclusive)
	            int randomIndex = random.nextInt(i + 1);
	            // Swap array[i] and array[randomIndex]
	            int temp = array[i];
	            array[i] = array[randomIndex];
	            array[randomIndex] = temp;
	        }
	    }
	}



