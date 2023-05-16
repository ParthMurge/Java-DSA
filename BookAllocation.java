public class BookAllocation {
    public static void main(String[] args)
    {
        int[] arr = {2,8,8,4,5};

        int noS = 6;

        int allocationResult = allocate(arr, noS);

        if(noS > arr.length)
        {
            allocationResult = -1;
        }

        System.out.println(allocationResult);
    }

    private static int allocate(int[] arr, int noS)
    {
        int s = 0;

        int sum = 0;
        for(int i:arr)
        {
            sum += i;
        }

        int e = sum;

        int mid = s + (e - s)/2;

        int ans = -1;
        while(s <= e)
        {
            if(ifPossible(arr, noS, mid))
            {
                ans = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
            mid = s + (e - s)/2;
        }
        return ans;
    }

    private static boolean ifPossible(int[] arr, int noS, int mid)
    {
        int studentCount = 1;
        int pagesCount = 0;

        for(int i=0; i<arr.length; i++)
        {
            if((pagesCount + arr[i]) <= mid)
            {
                pagesCount += arr[i];
            }
            else
            {
                studentCount++;
                if(studentCount > noS  || pagesCount > mid)
                {
                    return false;
                }
                pagesCount = 0;
                pagesCount = arr[i];
            }
        }
        return true;
    }
}
