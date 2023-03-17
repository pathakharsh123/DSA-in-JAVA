import java.util.*;
public class spiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int spiral[][] = new int [n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                spiral[i][j] = sc.nextInt();
            }
        }
        int Start_row = 0;
        int end_row = n-1;
        int Start_col = 0;
        int end_col = m-1;

        while(Start_row<=end_row && Start_col<=end_col){
            // top row
            for (int i=Start_col;i<=end_col;i++){
                System.out.print(spiral[Start_row][i]+" ");
            }
            // end col
            for (int i=Start_row+1;i<=end_row;i++){
                System.out.print(spiral[i][end_col]+" ");
            }
            // end row
            for (int i = end_col-1;i>=Start_col;i--){
                System.out.print(spiral[end_row][i]+" ");
            }
            // start col
            for (int i=end_row-1;i>=Start_row+1;i--){
                System.out.print(spiral[i][Start_row]+" ");
            }
            Start_row++;
            end_row--;
            Start_col++;
            end_col--;
        }
    }
}