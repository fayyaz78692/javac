import java.util.Scanner;
class Array4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the "+(i+1)+" first number ");
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
            
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
}