
public class BinarySearch {
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] even = {2, 4, 6, 8, 10, 12};

        System.out.println("Enter the value you want to search in the array : ");
        int key = sc.nextInt();
        
        int result = search(even, key);

        System.out.println("The index of " +key+ " is : "+result);

        sc.close();
    }

    private static int search(int[] array, int key)
    {
        int start = 0;
        int end = array.length-1;

        // int mid = (start + end)/2;
        int mid = start + (end - start)/2;

        while(start <= end)
        {
            if(array[mid] == key)
            return mid;

            if(key > array[mid])
            start = mid + 1;

            else if(key < array[mid])
            end = mid - 1;

            mid = start + (end - start)/2;
        }

        return -1;
    }
}