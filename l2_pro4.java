// Write a Java Program to calculate area of circle using constructor.

import java.util.Scanner;
class area
{
	double area;
	area(double r)
	{
	 area= (22*r*r)/7;
	}
}
class l2_pro4 
{
    public static void main(String args[]) 
    {   
      System.out.println("Name :- Vadariya Shrey M.");
      System.out.println("Er. No.:- 220130318054");
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the radius :: ");
      double rad= sc.nextDouble();      
      area  a=new area(rad);
      System.out.print("Area of Circle is :: " + a.area);      
    }
}