public class ElementInRotatedSorted {
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] arr = {10, 11, 17, 1, 3, 4, 6, 8};
        
        int pivotEle = pivotElement(arr);

        System.out.println("Enter an element you want to search in the array : ");
        int key = sc.nextInt();

        int keyIndex = 0;
        if(key >= arr[pivotEle] && key < arr[0])
            // Binary Search on second line
            keyIndex = search(arr, pivotEle, arr.length-1, key);
        else
            //Binary Search on first line
            keyIndex = search(arr, 0, pivotEle-1, key);

        System.out.println("The index of the element in the array is : "+keyIndex);

        sc.close();
    }

    private static int pivotElement(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] <= arr[0])
            {
                e = mid;
            }
            else if(arr[mid] >= arr[0])
            {
                s = mid + 1;
            }
            mid = s + (e - s)/2;
        }

        return s;
    }

    private static int search(int[] arr, int s, int e, int key)
    {
        int mid = s + (e - s)/2;

        while(s <= e)
        {
            if(key == arr[mid])
            {
                return mid;
            }
            if(key > arr[mid])
            {
                s = mid + 1;
            }
            else if(key < arr[mid])
            {
                e = mid - 1;
            }
            mid = s + (e - s)/2;
        }
        return -1;
    }
}
