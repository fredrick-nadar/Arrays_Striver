
import java.util.HashSet;

public class LongestSeq {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int[] arr = {10};

        if(arr == null || arr.length == 0){
            System.out.println(0);
        }
        int length = 0;
        int maxLength = Integer.MIN_VALUE;

        for(int i : arr){
            set.add(i);
        }

        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i] - 1)){
                length = 1;
                while(set.contains(arr[i] + 1)){
                    length++;
                    arr[i]++;
                }

                maxLength = Math.max(maxLength,length);
            }
        }

        System.out.println(maxLength);
    }
}
