import java.util.*;

public class MatrixAdd{
    public static void main (String args[])
    {   
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row :");
        int row=sc.nextInt();
        System.out.print("Enter the Column :");
        int column = sc.nextInt();
        int arr1[][]= new int[row][column];
        int arr2[][]= new int[row][column];
        int arr3[][]= new int[row][column];
        System.out.println("enter 1st matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column ;j++)
            {
                arr1[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("enter 2st matrix elements");
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<column ;j++)
            {
                arr2[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("The Addition of 2 matrices are :");
        for(int i=0;i<arr1.length ;i++)
        {
            for(int j=0;j<arr2[i].length ;j++)
            {
              arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
