package PepAssignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char whiteSquare = '\u25A1';
        char blackSquare = '\u25A0';
        char queen = '\u2655';
        int n,k=0;
        System.out.print("Enter number of queen you want to place (max limit 4) : ");
        n=sc.nextInt();


        int[] row=new int[n];
        int[] col=new int[n];

        System.out.println();

        System.out.println("Enter the row and the column on which you want the queen/queens :");

        for(k=0;k<n;k++)
        {
            System.out.println("Coordinate "+(k+1)+" :");
            row[k]=sc.nextInt();
            col[k]=sc.nextInt();
            for(int m=0;m<k;m++)
            {
                if(row[m]==row[k] || col[m]==col[k])
                {
                    System.out.println("Try again as no queen can be placed in the same row or same column as of other queen");
                    System.out.println("Coordinate "+(k+1)+" :");
                    row[k]=sc.nextInt();
                    col[k]=sc.nextInt();
                }
            }
            System.out.println();
        }

        k=0;

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(k<n)
                {
                    if(row[k]==i+1 && col[k]==j+1)
                    {
                        System.out.print(queen+" ");
                        k++;
                    }
                    else if(i%2==0)
                    {
                        char square = j%2==0 ? whiteSquare : blackSquare ;
                        System.out.print(square+" ");
                    }
                    else if((i+1)%2==0)
                    {
                        char square = (j+1)%2==0 ? whiteSquare : blackSquare ;
                        System.out.print(square+" ");
                    }
                }
                else
                {
                    if(i%2==0)
                    {
                        char square = j%2==0 ? whiteSquare : blackSquare ;
                        System.out.print(square+" ");
                    }
                    else if((i+1)%2==0)
                    {
                        char square = (j+1)%2==0 ? whiteSquare : blackSquare ;
                        System.out.print(square+" ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
