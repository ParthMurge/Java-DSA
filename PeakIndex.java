public class PeakIndex {
    public static void main(String[] args)
    {
        int[] arr = {3, 4, 12, 20, 5, 2, 1};

        int peakElement = search(arr);

        System.out.println("The peak element in the array is : "+peakElement);
    }

    private static int search(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e - s)/2;

        while(s < e)
        {
            if(arr[mid] < arr[mid+1])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }

            mid = s + (e - s)/2;
        }

        return mid;
    }
}
