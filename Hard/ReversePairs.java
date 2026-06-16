import java.util.*;

public class ReversePairs {

    public static void merge(int a[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> list = new ArrayList<>();

        while(left <= mid && right <= high){
            if(a[left] <= a[right]){
                list.add(a[left]);
                left++;
            }else{
                list.add(a[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(a[left]);
            left++;
        }

        while(right <= high){
            list.add(a[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            a[i] = list.get(i-low);
        }
    }   

    public static int pairs(int a[], int low, int mid, int high){
        int count = 0;

        int left = low;
        int right = mid+1;

        for(int i=left;i<=mid;i++){
            while(right <= high && a[i] > 2*a[right]) right++;
            count += right - (mid + 1);
        }

        return count;
    }

    public static int mergeSort(int a[], int low,int high){
        int count = 0;
        
        if(low >= high) return count;

        int mid = low + (high-low) /2;        
            count += mergeSort(a, low, mid);
            count += mergeSort(a, mid + 1, high);
            count += pairs(a,low,mid,high);
            merge(a,low,mid,high);

        return count;
    }
    public static void main(String[] args){
        int[] a = {1,3,2,3,1};
        int count = mergeSort(a, 0, a.length-1);
        System.out.println(count);

        for(int num : a){
            System.out.print(num + " "); 
        }
    }
}
