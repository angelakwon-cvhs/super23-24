public class ArrayUtils {
    
    /**
     * Finds the maximum value in an array of integers
     */

    // Step 1: Set up breakpoints. Breakpoints are where the debugger 
    // is going to stop and analyze the state of your program.
    // Breakpoints are like stop signs.


    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return -1; // Return -1 for empty arrays
        }
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Counts occurrences of a specific value in an array
     */
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != target) {
                count--;
            }
        }
        return count;
    }
    
    /**
     * Reverses the elements in an array (modifies the original array)
     */
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }
    }
    
    /**
     * Creates a new array containing only the even numbers from the input array
     */
    public static int[] filterEvenNumbers(int[] arr) {
        // Count even numbers first
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        
        // Create new array of appropriate size
        int[] result = new int[count];
        
        // Fill the new array
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
            }
        }
        
        return result;
    }
    

    /**
     * Checks if an array is sorted in ascending order
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i+1]) { // creating an error
                return false;
            }
        }
        return true;
    }
}
