public class FirstOccBinary {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 5, 6, 7};

        int key = 3;

        int ans = search(arr, key);

        System.out.println("The index of "+key+" in the array is : "+ans);
    }

    private static int search(int[] arr, int key)
    {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        int mid = s + (e - s)/2;

        while(s <= e)
        {
            if(key == arr[mid])
            {
                ans = mid;
                e = mid - 1;
            }
            else if(key < arr[mid])
            {
                e = mid - 1;
            }
            else if(key > arr[mid])
            {
                s = mid + 1;
            }

            mid = s + (e - s)/2;
        }

        return ans;
    }
}
