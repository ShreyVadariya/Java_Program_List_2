// Write a program in Java to demonstrate use of ‘this’ keyword. 

public class l2_pro5 
{
    int num;

    l2_pro5() {
        this(10);
    }

    l2_pro5(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Value of num :: " + this.num);
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        l2_pro5 obj = new l2_pro5();
        obj.display();
    }
}