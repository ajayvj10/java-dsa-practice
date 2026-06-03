import java.util.*;

public class Transpose2D{
    public static void main (String args[])
    {   
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row :");
        int row=sc.nextInt();
        System.out.print("Enter the Column :");
        int column = sc.nextInt();
        int arr[][]= new int[row][column];
        int trans[][]= new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column ;j++)
            {
                arr[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<arr.length ;i++)
        {
            for(int j=0;j<arr[i].length ;j++)
            {
             trans[j][i]= arr[i][j];
            }
        }
        for(int i=0;i<trans.length;i++)
        {
            for(int j=0;j<trans[i].length;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
