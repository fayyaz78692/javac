import java.util.Scanner;
class Array2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int expenses1[]=new int[s];
        int expenses2[]=new int[s];
        int i;
       System.out.println("Enter the first elements ");
        for(i=0;i<expenses1.length;i++){
            System.out.println((i+1)+" Enetr expenses ");
            expenses1[i]=sc.nextInt();
        }
        System.out.println("Enter the second elements ");
        for(i=0;i<expenses2.length;i++){
            System.out.println((i+1)+" Enetr expenses ");
            expenses2[i]=sc.nextInt();
        }
        boolean equal=true;
        for(i=0;i<s;i++){
            if(expenses1[i]!=expenses2[i]){
                equal=false;
                break;
            }
        }
     if(equal){
        System.out.println("success \n\n\n");
     }
     else{
        System.out.println("faliur \n\n\n");
     }
     System.out.println("copy of all elements to another array");
     int arr[]=new int[s];
     for(i=0;i<s;i++){
        arr[i]=expenses1[i];
     }     
     for(i=0;i<s;i++){
        System.out.println(arr[i]);
     }
    
    }
}