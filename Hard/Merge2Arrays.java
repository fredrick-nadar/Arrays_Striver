public class Merge2Arrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};

        int m = 3;
        int n = 3;

        int left= m-1;
        int right = n-1;
        int total = m+n-1;

        while(left >= 0 && right >= 0){
            if(arr1[left] > arr2[right]){
                arr1[total] = arr1[left];
                total--;
                left--; 
            }else{
                arr1[total] = arr2[right];
                total--;
                right--;
            }
        }

        while(right >= 0){
            arr1[total] = arr2[right];
                total--;
                right--;
        }

        for(int arr : arr1){
            System.out.print(arr + " ");
        }
    }
}
