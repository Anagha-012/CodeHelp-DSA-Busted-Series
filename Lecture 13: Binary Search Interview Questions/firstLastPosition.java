import javafx.util.*;  // for Pair clss
import java.util.*;

public class Solution {

   static int firstOccurance(ArrayList<Integer> arr, int n, int k)
   {
       int start = 0, end = n-1, mid = (start+end)/2, ans = -1;
       //for first occurance , search in the left part of the array
        while(start <= end)
        {
            if(arr.get(mid) == k)
            {
                ans = mid;
                end = mid-1;
            }
            else if(arr.get(mid) > k)
            {
                end = mid-1;
            }
            else if(arr.get(mid) < k)
            {
                start = mid+1;
            }
            mid = (start+end)/2;
            
        }
       return ans;
   }
   static int lastOccurance(ArrayList<Integer> arr, int n, int k)
   {
       int start = 0, end = n-1, mid = (start+end)/2, ans = -1;
       //for last occurance , search in the right part of the array
        while(start <= end)
        {
            if(arr.get(mid) == k)
            {
                ans = mid;
                start = mid+1;
            }
            else if(arr.get(mid) > k)
            {
                end = mid-1;
            }
            else if(arr.get(mid) < k)
            {
                start = mid+1;
            }
            mid = (start+end)/2;
            
        }
       return ans;
   }
    public static Pair<Integer, Integer> firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
       
        int ans1 = firstOccurance(arr, n, k);
        int ans2 = lastOccurance(arr, n, k);
        Pair<Integer, Integer> p = new Pair<>(ans1 ,ans2);  
        return p;
    }
    
};
