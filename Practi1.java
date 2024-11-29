import java.util.Scanner;
class Practi1{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        int i;
        int flag=0;
        int serch;
        int count=0;
        for(i=0;i<s;i++){
            System.out.println("enter the elements of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enetr element to serch and replace");
        serch=sc.nextInt();
        
for(i=0;i<arr.length;i++){
    if(arr[i]==serch){
        flag=1;
        System.out.println("Element found at "+(i+1));

        count++;
    }
}
if(flag==1){
    System.out.println("the elements found is :-"+count);
}
else{
    System.out.println("element is not found");
}
//System.out.println("total number of elments found is:- "+count);
int replace;
System.out.println("which element by which you have to replace ");
replace=sc.nextInt();
for(i=0;i<arr.length;i++){
    if(arr[i]==serch){
        arr[i]=replace;
    }
}
System.out.println("the elements after raplace is:-");
for(i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();

    }
}