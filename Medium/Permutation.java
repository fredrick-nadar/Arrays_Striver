public class Permutation{

    public static void swap(int arr[], int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void reverse(int arr[],int left,int right){
        swap(arr,left,right);
        left++;
        right--;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int index = -1;

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,arr.length-1);
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] > index){
                swap(arr,i,index);
                break;
            }
        }
        reverse(arr,index+1,arr.length-1);
        
        for(int nums:arr){
            System.out.print(nums + " ");
        }


    }
}