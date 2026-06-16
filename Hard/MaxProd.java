public class MaxProd {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4,-5};

        int suffix = 1;
        int prefix = 1;
        int max =Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(suffix == 0) suffix = 1;
            if(prefix == 0) prefix = 1;

            prefix *= arr[i];
            suffix *= arr[arr.length - i - 1];

            max = Math.max(max,Math.max(prefix,suffix));
        } 

        System.out.print(max);
    }
}
