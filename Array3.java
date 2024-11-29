import java.util.Scanner;
class Array3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of student ");
        int stu=sc.nextInt();
       // System.out.println("Enter the number of subjects ");
        //int nsub=sc.nextInt();
        int rno[]= new int[stu];
        float m1[]= new float[stu];
        float m2[]=new float[stu];
        float m3[]=new float[stu];
        float total[]=new float[stu],avg[]=new float[stu];
        float max1=0,max2=0,max3=0;
        int top1=0,top2=0,top3=0;
        String name[]=new String[stu];
        String name1=; 
        
        for(int i=0;i<rno.length;i++){
            System.out.println("marks for "+(i+1)+"  student ");
            System.out.println("Enter the name of first student");
            name[i]=sc.next();
            System.out.println("Enter the roll number of "+(i+1)+"student ");
            rno[i]=sc.nextInt();
            System.out.println("enter first subject marks");
            m1[i]=sc.nextFloat();
            System.out.println("enter second subject ");
            m2[i]=sc.nextFloat();
            System.out.println("enter the third subject marks");
            m3[i]=sc.nextFloat();
            System.out.println("___________________________________________________");
            
            if(m1[i]>max1){
                max1=m1[i];
                top1=rno[i];
            }
            if(m2[i]>max2){
                max2=m2[i];
                top2=rno[i];
        }
        if(m3[i]>max3){
            max3=m3[i];
            top3=rno[i];
        }
    }
        float max4=0;
        int top4=0;
        for(int i=0;i<rno.length;i++){
            total[i]=m1[i]+m2[i]+m3[i];
        
            System.out.println("total of "+(i+1)+" student is "+total[i]);
           if(max4<total[i]){
            max4=total[i];
            top4=rno[i];
           }
        }
        System.out.println("___________________________________________________");
        for(int i=0;i<rno.length;i++){
            avg[i]=total[i]/3f;
            System.out.println("avarage of "+(i+1)+"  student is "+avg[i]);
            }
            System.out.println("___________________________________________________");
                    System.out.println("the maximum of 1st subject is :- "+max1+" of roll nummber:-"+top1);
                    System.out.println("___________________________________________________");
                    System.out.println("the maximum of second subject is :- "+max2+" of roll number:-"+top2);
                    System.out.println("___________________________________________________");
                    System.out.println("the maximum of third subject  is :- "+max3+" of roll number "+top3);
                    System.out.println("___________________________________________________");
                    System.out.println("the marks of topper of a clas is :- "+max4+" of roll number "+top4);
    }
}