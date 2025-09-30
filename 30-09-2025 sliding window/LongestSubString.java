problem statement
    Find the longest substring without repeating characters.
    Input: s = "abcabcbb"
    Output: 3 ("abc")

Approaches:
   1.Naive-->using two for loops and hashset-->T.C-->O(n*n*n)-->S.C-->O(n)

   2-->using two pointer ,sliding window technique and HashMap
  
Code:

import java.util.*;
class Main5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	   

        int result = lengthLS(str);
        System.out.println("Longest Sunstring without repeating characters"+result);
	}
	static int lengthLS(String str)
	{
	    int st=0;
	    int max_length=0;
	    Map<Character,Integer> map=new HashMap<>();
	    for(int end=0;end<str.length();end++ )
	    {
	        char temp=str.charAt(end);
	        if(map.containsKey(temp))
	        {
	            st=Math.max(map.get(temp)+1,st);
	        }
	        map.put(temp,end);
	        max_length=Math.max(max_length,end-st+1);
	    }
	    return max_length;
	}
}
