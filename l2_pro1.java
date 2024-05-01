// Write a Java Program using Argument Constructor. 

import java.util.Scanner;

class test
{
    test(int a,int b)
    {
        int c=a+b;
        System.out.println("The sum is :: "+c);
    }
}
class l2_pro1 
{
    public static void main(String[] args) 
    {
        int a,b;
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a :: ");
        a=sc.nextInt(); 
        System.out.print("Enter b :: ");
        b=sc.nextInt();
        test t=new test(a,b);  
    }    
}