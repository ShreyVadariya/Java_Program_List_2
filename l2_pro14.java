public class l2_pro14 
{
    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        l2_pro14 converter = new l2_pro14();

        // Test the methods
        double fahrenheit = 98.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        celsius = 37;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
} 
