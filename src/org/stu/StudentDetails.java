package org.stu;
import java.util.Scanner;
public class StudentDetails {
	private void sampledisplay() {
		System.out.println("Updated");
	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter student ID : ");
		String studentId=scan.next();
		System.out.println("Student ID : "+studentId);
				
		System.out.println("Enter student Name : ");
		String studentName=scan.next();
		System.out.println("Student Name : "+studentName);
		
		System.out.println("Enter Mark1 : ");
		short mark1=scan.nextShort();
		System.out.println("Mark1 : "+mark1);
		
		System.out.println("Enter Mark2 : ");
		short mark2=scan.nextShort();
		System.out.println("Mark2 : "+mark2);
		
		System.out.println("Enter Mark3 : ");
		short mark3=scan.nextShort();
		System.out.println("Mark3 : "+mark3);
		
		System.out.println("Enter Mark4: ");
		short mark4=scan.nextShort();
		System.out.println("Mark4 : "+mark4);
		
		System.out.println("Enter Mark5 : ");
		short mark5=scan.nextShort();
		System.out.println("Mark5 : "+mark5);
		
		//Finding the total
		long total=mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total :"+total);	
				
		//Finding the Average
		float average=total/5;
		System.out.println("Average : "+average);
				
	}
}
 