// Write a Java program using copy constructor.
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person copy) {
        name = copy.name;
        age = copy.age;
    }

    public void display() {
        System.out.println("Name is :: " + name);
        System.out.println("Age is :: " + age);
    }

    public void introduce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'introduce'");
    }
}

public class l2_pro9 {
    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the your name :: ");
        String name = get.nextLine();

        System.out.print("Enter the your age :: ");
        int age = get.nextInt();

        Person person1 = new Person(name, age);
        Person person2 = new Person(person1);

        System.out.println("Details of person1");
        person1.display();

        System.out.println("\nDetails of person2");
        person2.display();

        get.close();
    }
}