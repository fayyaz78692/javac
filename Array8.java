import java.util.Scanner;
class Array8{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row of the Array");
        int row=sc.nextInt();
        System.out.println("Enter the column of the array");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter the elements");
                arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("digonal is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+j==arr.length-1){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}