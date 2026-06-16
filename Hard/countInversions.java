public class countInversions{

    public static int merge(int arr[], int low, int mid, int high){
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int idx = 0;

        int count = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[idx++] = arr[left++];
            }else{
                temp[idx++] = arr[right++];
                count += mid-left+1;
            }
        }

        while(left <= mid){
            temp[idx++] = arr[left++];
        }

        while(right <= high){
            temp[idx++] = arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }

        return count;

    }

    public static int mergeSort(int arr[] ,int left, int right){
        int count = 0;
        if(left >= right) return count;

        int mid = left + (right - left) / 2;

        count += mergeSort(arr,left,mid);
        count += mergeSort(arr,mid+1,right);
        count += merge(arr,left,mid,right);

        return count;
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};

        int count = mergeSort(arr,0,arr.length-1);
        System.out.println(count);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}