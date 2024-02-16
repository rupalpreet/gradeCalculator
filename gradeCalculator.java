85import java.io.*;
import java.util.*;

public class gradeCalculator {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE FIRST SUBJECT :");
        int maths=scn.nextInt();
        System.out.println("ENTER THE SECOND SUBJECT :");
        int science=scn.nextInt();
        System.out.println("ENTER THE THIRD SUBJECT :");
        int SST=scn.nextInt();
        System.out.println("ENTER THE FOURTH SUBJECT :");
        int eng=scn.nextInt();
        System.out.println("ENTER THE FIFTH SUBJECT :");
        int hindi=scn.nextInt();
        int n=5;
        int sum=maths+science+SST+eng+hindi;
        System.out.println("the sum is :" +sum);
        int avg=sum/n;
        System.out.println("the avg is :"+avg);
        if(avg>=80)
               {
                   System.out.print(" grade is A");
               }
               else if(avg>=60 && avg<80)
               {
                  System.out.print(" grade is B");
               } 
               else if(avg>=40 && avg<60)
               {
                   System.out.print(" grade is C");
               }
               else
               {
                   System.out.print("grade is D");
               }
}
}
