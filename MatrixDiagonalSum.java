import java.util.*;

public class MatrixDiagonalSum{
    public static void main (String args[])
    {
        int row,column;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the row :");
        row =sc.nextInt();
        System.out.print("enter the column :");
        column =sc.nextInt();
        int arr[][]= new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum+=arr[i][i];
        }
        System.out.print("The diganoal sum is : " + sum);
    }
}