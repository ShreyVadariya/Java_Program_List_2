// Write a program in Java that pass object as parameter.

class person {
    String name;
    int age;
}

public class l2_pro6 {
    public static void modifypersonage(person person, int newage) {
        person.age = newage;
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        person person1 = new person();
        person1.name = "Shrey";
        person1.age = 17;

        System.out.println("Initial age of " + person1.name + " :: " + person1.age);
        modifypersonage(person1, 18);
        System.out.println("Updated age of " + person1.name + " :: " + person1.age);
    }
}