Problem Statement:
    Count number of substrings that are anagrams of a given string p.
Input: s = "cbaebabacd", p = "abc"
output: res=2 ("cba", "bac")

Approach:
    Sliding window technique + frequency Array.

T.C-->O(txt.length())
S.C-->O(26)

Code:
import java.util.*;
class Main2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String txt=sc.nextLine();
	    String pat=sc.nextLine();

        int result = anagram(txt, pat);
        System.out.println("Maximun count of angrams"+result);
	}
	static int anagram(String txt,String pat)
	{
	    int txtc[]=new int[26];
	    int patc[]=new int[26];
	    int k=pat.length();
	    int res=0;
	    for(int i=0;i<pat.length();i++)
	    {
	        patc[pat.charAt(i)-'a']++;
	    }
	    for(int i=0;i<txt.length();i++)
	    {
	        txtc[txt.charAt(i)-'a']++;
	        if(i>=k-1)
	        {
	            if(Arrays.equals(patc,txtc)==true)
	            {
	                res++;
	            }
	            txtc[txt.charAt(i-k+1)-'a']--;
	        }
	    }
	    return res;
	}
}

   
