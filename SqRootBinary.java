public class SqRootBinary {
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the Square");
        long square = sc.nextInt();

        long squareRoot = search(square);

        System.out.println("Square Root of "+square+" is : "+squareRoot);

        sc.close();
    }

    private static long search(long squareEle)
    {
        long s = 0;
        long e = squareEle;

        long mid = s + (e - s)/2;

        long ans = -1;
        while(s <= e)
        {
            long square = mid * mid;
            if(square == squareEle)
            {
                return mid;
            }
            if(square > squareEle)
            {
                e = mid - 1;
            }
            if(square < squareEle)
            {
                ans = mid;
                s = mid + 1;
            }
            mid = s + (e - s)/2;
        }
        return ans;
    }
}
