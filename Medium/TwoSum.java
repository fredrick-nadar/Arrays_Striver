import java.util.*;

public class TwoSum{

    public static int[] read(int arr[] , int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr = target - arr[i];

            if(map.containsKey(curr)){
                return new int[]{map.get(curr),i};
            }
            map.put(arr[i],i);
            
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int arr[] = {4,2,1,3,1};
        int target = 5;
        int[] ans = read(arr, target);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}