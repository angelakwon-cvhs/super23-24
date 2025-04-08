public class ArrayUtilsTester {
    // Create test arrays
    static int[] arr1 = {4, 2, 7, 1, 9, 5};
    static int[] arr2 = {3, 3, 3, 3, 3}; // feel free to add more arrays
    static int[] arr3 = {};

    public static void main(String[] args) {
        testFindMax();
        testReverseArray();
        testIsSorted();
    }
    
    
    public static void testFilterEvenNumbers() {
        // assert arr1.filterEvenNumbers.equals({4, 2})
    }

    public static void testFindMax() {
        System.out.println("Testing findMax...");
 	    int[] arr1 = {4, 2, 7, 1, 9, 5};
        int[] arr2 = {3, 3, 3, 3, 3}; // feel free to add more arrays
        int[] arr3 = {};

// This is the start
        int desired_result = 3; // goal for findMax
        int actual_result = ArrayUtils.findMax(arr2); // --> 3
        // this is what I want: test_result == actual_result
        System.out.println(desired_result == actual_result);


  // Write test cases here
    }
    
    public static void testCountOccurrences() {
        System.out.println("Testing countOccurrences...");
        int[] arr1 = {4, 2, 7, 1, 9, 5};
        int[] arr4 = {2, 5, 6, 6, 4};
        int[] arr2 = {3, 3, 3, 3, 3}; // feel free to add more arrays
        int[] arr3 = {};

        int test_result = ArrayUtils.countOccurrences(arr1, 4);
        int wanted_result = 1;
        System.out.println(test_result == wanted_result);
        assert test_result == wanted_result;

        int actual_result = ArrayUtils.countOccurrences(arr4, 6);
        int expected_result = 2;
        System.out.println(actual_result == expected_result);
        assert actual_result == expected_result; 
        // assert actual_result != expected_result; -- assertions don't work
        // as long as you get a True or False value 
        // you know that the test is working 
  // Write test cases here
    }


    
    public static void testReverseArray() {
        System.out.println("Testing reverseArray...");
        
        int[] arr5 = {1, 2, 3, 4};
        int[] reversed = {4, 3, 2, 1};  // expected_result

        

        ArrayUtils.reverseArray(arr5);
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] != reversed[i]){
                System.out.println(false);
                return;
            }   
        }
        System.out.println(true);
        // another way
        System.out.println(arr5.equals(reversed));

        System.out.println("TEST 2");

        int [] arr1 = {4, 2, 7, 1, 9, 5};
        int[] actual_result = {5, 9, 1, 7, 2, 4};

        System.out.println((arr1).equals(actual_result));
    }   
    
    public static void testIsSorted() {
        System.out.println("Testing isSorted...");

        assert ArrayUtils.isSorted(ArrayUtilsTester.arr1) == false;
        assert ArrayUtils.isSorted(ArrayUtilsTester.arr2) == true;
        assert ArrayUtils.isSorted(ArrayUtilsTester.arr3) == true;


    }
    
    // Helper method to print arrays, you don't HAVE to use these, but it may help
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}
