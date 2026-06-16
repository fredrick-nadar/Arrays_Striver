public class Alt {
    public static void main(String[] args){
        int arr[] = {3,1,-2,-5,2,-4};
        int result[] = new int[arr.length];
        int pos = 0;
        int neg=1;

        for(int i=0;i<arr.length;i++){
            

            if(arr[i] > 0){
                result[pos] = arr[i];
                pos+=2;
            }
            if(arr[i] < 0){
                result[neg] = arr[i];
                neg += 2;
            }
        }

        for(int j=0;j<result.length;j++){
            System.out.print(result[j] + " ");
        }
    }
}
