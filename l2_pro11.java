/*Create an object of the Person class and use the getter and 
setter methods to set the person’s attributes. Call the 
introduce method to print out the person’s introduction 
message */
import java.util.Scanner;

public class l2_pro11 {
    private String name;
    private int age;
    private String address;

    public l2_pro11(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + " years old. I live at " + getAddress() + ".");
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = get.nextLine();

        System.out.print("Enter your age: ");
        int age = get.nextInt();
        get.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your address: ");
        String address = get.nextLine();

        l2_pro11 person = new l2_pro11(name, age, address);
        person.introduce();

        get.close();
    }
}

