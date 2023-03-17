import java.util.Scanner;
public class creating{
    public static boolean Search(int matrix[][],int key){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.print("key found at (" + i+ ","+j+")");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max  = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.print(max);
    }
}