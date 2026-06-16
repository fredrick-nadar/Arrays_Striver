import java.util.HashMap;

public class SubarraySum0 {
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(sum == 0){
                maxLen = Math.max(maxLen,i+1);
            }

            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        System.out.print(maxLen);
    }
}
