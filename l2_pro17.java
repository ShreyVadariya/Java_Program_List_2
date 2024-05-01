/*Create a main method that creates an instance of each class and calls its methods appropriately. 
Test the classes by providing sample inputs and printing out the results. */
class l2_pro17 {
    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Calculator c = new Calculator();
        int s = c.add(5, 3);
        System.out.println("Sum is " + s);

        Rectangle r = new Rectangle();
        int a = r.CalculatorArea(4, 5);
        System.out.println("Area is " + a);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Rectangle {
    public int CalculatorArea(int i, int w) {
        return i * w;
    }
}