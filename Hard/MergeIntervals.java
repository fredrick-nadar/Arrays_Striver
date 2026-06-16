import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        for(int[] interval : intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1] < interval[0]){
                list.add(interval);
            }else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], interval[1]);
            }
        }

        int result[][] = list.toArray(new int[list.size()][]);

        System.out.println(Arrays.deepToString(result));
    }
}
