// Write a program in Java of method overloading. 

public class l2_pro7 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + "" + b;
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        
        System.out.println("Sum of 4 & 5 :: "+add(4, 5));
        System.out.println("Sum of 4,5 & 6 :: "+add(4, 5, 6));
        System.out.println("Sum of 4.5 & 2.5 :: "+add(4.5, 2.5));
        System.out.println("Connected string is :: "+add("Hello", "World"));
    }
}
