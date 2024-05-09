package task2;
import java.util.*;
public class student_grade_cal 
{
	public static void main (String[] argv)
	{
		int i,marks,total_marks=0;
	       double avg_percentage;
	       char grade;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Number of Subjects:");
	       int a=sc.nextInt();
	       
	       for(i=1;i<=a;i++)
	       {
	           System.out.println("Enter marks obtained in "+i+":");
	           marks=sc.nextInt();
	           total_marks=total_marks+marks;
	           
	       }
	       avg_percentage=total_marks/a;
	       
	       if (avg_percentage <=100 && avg_percentage  >=90)
	       {
	            grade='A';
	       }
	       else if (avg_percentage <90 && avg_percentage >=80)
	       {
	            grade='B';
	       }
	       else if (avg_percentage <80 && avg_percentage >=70)
	       {
	            grade='C';
	       }
	       else if (avg_percentage <70 && avg_percentage >=60)
	       {
	            grade='D';
	       }
	       else
	       {
	           grade='F';
	       }
	       
	       System.out.println("Total Marks:"+total_marks);
	       System.out.println("Average Percentage:"+avg_percentage);
	       System.out.println("Grade:"+grade);

	}
}
