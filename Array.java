import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int expenses[]=new int[s];
        int expenses1[]=new int[s];        
        int i;
       
        for(i=0;i<expenses.length;i++){
            System.out.println((i+1)+" Enetr element");
            expenses[i]=sc.nextInt();
        }
        for(i=0;i<expenses.length;i++){
            System.out.println((i+1)+" Enetr element");
            expenses1[i]=sc.nextInt();
        }
        
        int min=expenses[0];
        int max=expenses[0];
        int sum=0;
        
        for(i=0;i<=expenses.length-1;i++){
            sum+=expenses[i];
            
            if(expenses[i]<min){
                min=expenses[i];
            }
        }
        for(i=0;i<=expenses.length-1;i++){
            if(expenses[i]>max){
                max=expenses[i];
            }
        }
        System.out.println("the even numbers are ");
        for(i=0;i<=expenses.length-1;i++){
            if(expenses[i]%2==0){
                System.out.print(expenses[i]+",");
            }
          
        }
       System.out.println("_________________________________________________");
        int sum2=0;
        for(i=0;i<expenses.length;i++){
            sum2=sum2+expenses[i];
            ++i;
        }
        System.out.println("\n the divisible of 23 are :-");
        for(i=0;i<=expenses.length-1;i++){
            if(expenses[i]%23==0){
                System.out.print(expenses[i]+",");
            }
        }
        System.out.println("_________________________________________________________________");
        //System.out.println("\n\n");
        int temp=expenses[0];
        expenses[0]=expenses[1];
        expenses[1]=temp;
        for(i=0;i<expenses.length;i++){
            System.out.println(expenses[i]);
         }
         System.out.println("___________________________________________________________________");
        // System.out.println("\n ");
         for(i=0;i<expenses.length;i++){
            if(expenses[i]>25){
                expenses[i]=25;
            }
        }
        for(i=0;i<expenses.length;i++){
           System.out.println(expenses[i]);
        }
        System.out.println("_____________________________________________________________");
       // System.out.println("\n\n\n");
        for(i=1;i<expenses.length;i++){
            expenses[i]=0;
            ++i;
        }
        for(i=0;i<expenses.length;i++){
           System.out.println(expenses[i]);
        }
        System.out.println("____________________________________________________________________");
        for(i=0;i<expenses.length;i++){
            expenses[i]=10;
        }
        for(i=0;i<expenses.length;i++){
            System.out.println(expenses[i]);
         }
         System.out.println("_____________________________________________________________________");
        float avg=sum/s;
        System.out.println("the maximum expenses is "+max);
        System.out.println("_____________________________________________________________________");
       System.out.println("The minimum expenses is "+min);
       System.out.println("_____________________________________________________________________");
       System.out.println("The sum of    expenses is "+sum);
       System.out.println("_____________________________________________________________________");
       System.out.println("The sum of  alternate series is "+sum2);
       System.out.println("_____________________________________________________________________");
       System.out.println("The average of given series is "+avg);
        
    }
}