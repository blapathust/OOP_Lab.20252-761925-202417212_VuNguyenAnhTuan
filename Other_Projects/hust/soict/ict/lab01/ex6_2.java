import java.util.Scanner;

public class ex6_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Name? :");
        String name = input.nextLine();

        System.out.println("Age? :");
        int age = input.nextInt();

        System.out.println("Height? :");
        double height = input.nextDouble();

        System.out.println("Hi " + name + "! You are " + age + " years old and " + height + "cm tall.");
    }
}
