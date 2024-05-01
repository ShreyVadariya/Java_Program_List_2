/*Demonstrate usage of wrapper classes by creating a variable 
“num” of type int, wrapping it with the integer class, and 
printing out the wrapped value. Also, parse the String “20” 
into an int and print out the parsed value */
public class l2_pro15 {

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        // Wrapping an int value
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num);
        System.out.println("Wrapped value: " + wrappedNum);

        // Parsing a String to an int
        String str = "20";
        int parsedNum = Integer.parseInt(str);
        System.out.println("Parsed value: " + parsedNum);
    }

}
