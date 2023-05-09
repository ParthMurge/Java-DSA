public class PivotElement {
    public static void main(String[] args)
    {
        // for pivot element, the array must be sorted and rotated.
        int[] arr = {11, 13, 15, 1, 3, 4, 5, 6, 8};

        int pivot = search(arr);

        System.out.println("The indedx of the pivot element is : "+pivot);
    }

    private static int search(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] >= arr[0])
            {
                s = mid + 1;
            }
            else if(arr[mid] < arr[0])
            {
                e = mid;
            }

            mid = s + (e - s)/2;
        }

        return s;
    }
}
