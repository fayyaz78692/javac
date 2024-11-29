import java.util.Scanner;
class Array6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int s=sc.nextInt();
        System.out.println("Enter the size of array 2");
        int s2=sc.nextInt();

        int expenses[]=new int[s];
        int expenses1[]=new int[s2];        
        //int i;
       
        for(int i=0;i<s;i++){
            System.out.println((i+1)+" Enetr expenses:- ");
            expenses[i]=sc.nextInt();
        }
        for(int i=0;i<s2;i++){
            System.out.println((i+1)+" Enetr expenses1:-");
            expenses1[i]=sc.nextInt();
        }
        int arr[]=new int[s+s2];
        System.out.println("After marge");

        for(int i=0;i<s;i++){
            arr[i]=expenses[i];
            System.out.println(arr[i]);
        }
        for( int i=0;i<s2;i++){
            arr[s-i]=expenses1[i];
            System.out.println(arr[i]);
        }
    }
}