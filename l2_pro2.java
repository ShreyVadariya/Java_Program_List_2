// Write a Java Program that demonstrates the use of static method. 

class test
{
    static int a=10;
    int b=20;

    static void display()
    {
        System.out.println("a = "+a);
    }
    void show()
    {
        System.out.println("b = "+b);
    }
}
class l2_pro2 
{
    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        test t1=new test();
        t1.show();
        test.display();
    }        
}