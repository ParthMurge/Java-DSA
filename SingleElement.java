public class SingleElement {
    public static void main(String[] args) {

        // Find the element in hte array that is occuring only once in the array.

        // Approach : Bit Manipulation
        
        /*
         * 1. Initialize a variable (in this case 'result') with 0.
         * 2. Iterate a loop over the array.
         * 3. XOR each element in the array with the current 'result' in the loop.
         * 4. At the end, we will get the element that occures only once in the array.
         * 
         * XOR-ing any number with 0 result the number itself.
         * XOR-ing any number with itself results 0.
        */
        
        int[] arr = {1, 2, 4, 7, 1, 2, 4};

        System.out.println(find(arr));
    }

    private static int find(int[] arr) {

        int result = 0;

        for(int i:arr) {
            result ^= i;
        }

        return result;
    }
}