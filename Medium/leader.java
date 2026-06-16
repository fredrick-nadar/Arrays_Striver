import java.util.*;

public class leader {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {4, 7, 1, 0};
        list.add(arr[arr.length-1]);
        int currMax = arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){

            if(currMax < arr[i]){
                currMax = arr[i];
                list.add(currMax);
            }
        }

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
