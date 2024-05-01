// Write a Java Program that demonstrates the use of overloaded constructor. 

class test
{
    test()
    {
        System.out.println("Constructor with no arguments");
    }
    test(int x)
    {
        System.out.println("x= "+x);
    }
    test(int a,int b)
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
class l2_pro3 
{
    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        test t1=new test();
        test t2=new test(5);
        test t3=new test(2,3);   
    }
}