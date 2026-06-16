import java.util.*;
public class SubarrayCounTxORk{
    public static void main(String args[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int arr[] = {4, 2, 2, 6, 4};
        int xor = 0;
        int target = 6;
        int count = 0;
        mp.put(0,1);

        for(int i = 0;i<arr.length;i++){
            xor ^= arr[i];

            int required = xor ^ target;

            if(mp.containsKey(required)){
                count = count + mp.get(required);
            }

            if(mp.containsKey(xor)){
                mp.put(xor,mp.get(xor)+1);
            }else{
                mp.put(xor,1);
            }
        }
        System.out.println(count);
    }
}