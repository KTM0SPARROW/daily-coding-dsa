problem statement:
       Find the max sum of the subarray of size k.
Approaches:
       1.Naive method using two for loops
       2.using sliding window pattern(efficient)
 Time Complexity:O(size of the array)
 space Complexity:O(1) ---no need extra space

Edge cases:
     if(windowsize > arraysize)  --> invalid

Code:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
        int k = 3; 

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximun Sum"+result);
	}
	static int maxSumSubarray(int arr[],int k)
	{
	    int max_sum=Integer.MIN_VALUE;
	    int window_sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        window_sum+=arr[i];
	        if(i>=k-1)
	        {
	            max_sum=Math.max(max_sum,window_sum);
	            window_sum-=arr[i-(k-1)];
	        }
	    }
	    return max_sum;
	}
}

Sample i/o:
n=5,arr[]={1,2,3,4,5},k=3 ----->   3+4+5=12(final answer)
