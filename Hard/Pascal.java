import java.util.*;

public class Pascal {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows to be printed : ");
        int numRows = sc.nextInt();

        for(int i=0;i < numRows;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<i+1;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    List<Integer> prevRow = result.get(i-1);
                    int num = prevRow.get(j) + prevRow.get(j-1);
                    row.add(num);
                }
            }

            result.add(row);
        }

        for(List<Integer> ans : result){
            for(int i : ans){
                System.out.print(i);
            }
            System.out.println();
        }

        //or 

        System.out.println(result);
    }
}
