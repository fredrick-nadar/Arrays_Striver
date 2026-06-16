
import java.util.ArrayList;

public class MajorityII {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1,1,1,2,3,2,2}; 
        int elem1 = 0;
        int elem2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(count1 == 0 && arr[i] != elem2){
                elem1 = arr[i];
                count1++;
            }else if(count2 == 0 && arr[i] != elem1){
                elem2 = arr[i];
                count2++;
            }else if(arr[i] == elem1){
                count1++;
            }else if(arr[i] == elem2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == elem1) count1++;
            else if(arr[i] == elem2) count2++;
        }

        if(count1 > arr.length / 3){
            list.add(elem1);
        }

        if(elem1 != elem2 && count2 > arr.length / 3){
            list.add(elem2);
        }

        System.out.print(list);
    }
}
