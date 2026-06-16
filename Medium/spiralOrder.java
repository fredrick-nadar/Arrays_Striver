import java.util.ArrayList;

public class spiralOrder {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;

        while(startRow <= endRow && startCol <= endCol){
            for(int i=startCol ; i <= endCol ; i++){
                list.add(matrix[startRow][i]);
            }

            for(int i = startRow +1; i<= endRow; i++){
                list.add(matrix[i][endCol]);
            }

            if(startRow < endRow){
                for(int i = endCol - 1; i >= startCol; i--){
                    list.add(matrix[endRow][i]);
                }
            }

            if(startCol < endCol){
                for(int i = endRow - 1;i>startRow;i--){
                    list.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
