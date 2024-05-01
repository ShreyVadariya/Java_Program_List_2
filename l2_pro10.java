/*Create a class called “Person” with the following attributes: 
  Name (string)
  Age(int) 
  Address (string) 
  The class should have a constructor that accepts all 
three attributes and initializes them appropriately. It 
should also have getter and setter methods for each 
attribute, and a method called “introduce” that 
prints out the person’s name, age and address in a 
formatted string
*/
import java.util.Scanner;
public class l2_pro10 {
    private String name;
    private int age;
    private String address;

    public l2_pro10(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
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
        l2_pro13 person = new l2_pro13(name,age,address);
        person.introduce();
        get.close();
    }
}
