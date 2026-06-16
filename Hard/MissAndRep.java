public class MissAndRep {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,5};
        int xor = 0;
        int zeroGroup = 0;
        int oneGroup = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            xor ^= arr[i];
            xor ^= i+1;
        }

        int number = Integer.lowestOneBit(xor);

        for(int i = 0;i<n;i++){
            if((arr[i] & number) == 0){
                zeroGroup ^= arr[i];
            }else{
                oneGroup ^= arr[i];
            }
        }

        for(int i=1;i<=n;i++){
            if((i & number) == 0){
                zeroGroup ^= i;
            }else{
                oneGroup ^= i;
            }
        }

        int count = 0;
        for(int val : arr){
            if(val == zeroGroup){
                count++;
            }
        }

        if(count >= 2){
            System.out.print("Repeating is : " + zeroGroup + " and Missing is : " + oneGroup);
        }else{
             System.out.print("Repeating is : " + oneGroup + " and Missing is : " + zeroGroup);
        }


    }
}
