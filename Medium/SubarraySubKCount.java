
import java.util.HashMap;

public class SubarraySubKCount {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,2,3};
        int k = 3;
        int sum = 0;int count = 0;
        map.put(0,1);

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            int remaining = sum - k;

            if(map.containsKey(remaining)){
                count += map.get(remaining);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }

        System.out.print(count);
    }
}
