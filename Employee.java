package myProject;

import java.util.Scanner;
import java.io.*;

 class Emp
{
	int empid;
	float salary;
	String name;
	Scanner sc=new Scanner(System.in);
	
	 public Emp()
	{
		empid=0;
		salary=(float)0.0;
		name="";
		
	}
	void getdata()
	{
		System.out.println("enter empid ");
		empid=sc.nextInt();
		System.out.println("enter salary ");
		salary=sc.nextFloat();
		System.out.println("enter name ");
		name=sc.next();
	}
	
	void display()
	{
		
		System.out.println("   Name : " + name);
		System.out.println("   Emp_id : " + empid);
		System.out.println("   Salary : " + salary);
	}
	
	int delete()
	{int x;
	
		System.out.println("enter empid of the employee whose data is need to be deleted ");
		x=sc.nextInt();
		return x;
	}
	
	 int search()
	 {
		 int x;
		 System.out.println("enter empid of the employee to be searched ");
		 x=sc.nextInt();
		 
		 return x;
	 }
	 
	 int modify()
	 {
		 int x;
		 System.out.println("enter empid of the employee to be modified ");
		 x=sc.nextInt();
		 return x;
	 }
	
	
}


public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Emp emp[]=new Emp[10];
		Emp e=new Emp();
		for(int i=0;i<10;i++)
		{
			emp[i]=new Emp();
		}
		int ch=0,n=0;
		boolean i=true;
		while(i)
		{
			System.out.println("Enter 1 to add Employees ");
			System.out.println("Enter 2 to display all Employees data");
			System.out.println("Enter 3 to delete data of an employee ");
			System.out.println("Enter 4 to search Employees ");
			System.out.println("Enter 5 to modify Employees ");
			System.out.println("Enter 6 to Exit ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter no of employess ");
				n=sc.nextInt();
				for(int j=0;j<n;j++)
				{
					emp[j].getdata();
				}
				break;
			case 2:
				System.out.println("----------------------------Employee Database----------------------------");
				for(int j=0;j<n;j++)
				{
					emp[j].display();
				}
				break;
			case 3:
				int x=e.delete();
				int k=0;
				for(int j=0;j<n;j++)
				{
					if(emp[j].empid==x)
					{
						k=j;
						break;
					}
				}
				
				for(int j=k;j<n;j++)
				{
					emp[j]=emp[j+1];
				}
				n--;
				break;
				
			case 4:
				int y=e.search();
				int j;
				for(j=0;j<n;j++)
				{
					if(emp[j].empid==y)
						break;
				}
				
				System.out.println("Name : "+emp[j].name);
				System.out.println("Emp id  : "+emp[j].empid);
				System.out.println("Salary  : "+emp[j].salary);
				
				break;
			case 5:
				int z=e.modify();
				for(j=0;j<n;j++)
				{
					if(emp[j].empid==z)
					{
						break;
					}
				}
				
				emp[j].getdata();
				System.out.println("data modified ");
				break;
			case 6:
				i=false;
				break;
			}

		}
		
	}

	
	}


