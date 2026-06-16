import java.util.*;

public class SubarraySumK{

    public static int subarraySumK(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int len=0;int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];

            if(sum == target){
                len = Math.max(len,i+1);
            }

            int remaining = sum - target;

            if(map.containsKey(remaining)){
                len = Math.max(len, i-map.get(remaining));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
    public static void main(String[] args){
        int arr[] = {6, -2, 2, -8, 1, 7, 4, -10};
        int target = 8;
        
        System.out.println(subarraySumK(arr,target));
        
    }
}