public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {1, 10, 5, 9, 8, 4, 9};
        int n = arr.length;

        for(int i=0; i<n-1; i++)
        {
            int minIndex = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }
            // swap
            arr[minIndex] = (arr[i] + arr[minIndex]) - (arr[i] = arr[minIndex]);
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
