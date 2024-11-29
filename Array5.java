import java.util.Scanner;
class Array5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10}};
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter the size of row");
        int row=sc.nextInt();
        System.out.println("Enter the column of array");
        int col=sc.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
        int c[][]=new int[row][col];
        System.out.println("__________________________________________________");
        System.out.println("give entry of first array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the value at["+i+"]["+j+"]");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("The first array is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
          System.out.println("___________________________________________");
        System.out.println("give entry of second array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the value at["+i+"]["+j+"]");
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("___________________________________________________________________");
        System.out.println("The second array is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
       for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               c[i][j]=arr1[i][j]+arr2[i][j];
            }
            
        }
        System.out.println("___________________________________________________");
        System.out.println("The sum of two array is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");
        System.out.println("Transpose of array");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("________________________________________________");
        System.out.println("diagonal of aaray");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(i==j){
                System.out.print(arr1[i][j]+" ");
               }
            }
            System.out.println();
        }
    }
}