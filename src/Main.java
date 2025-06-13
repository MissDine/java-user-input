import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//A scanner - An object that allows us to accept user input in java
// Scanner is a built-in Java class in the java.util package.
//It's used to read input from various sources like the keyboard, files, or strings.
     Scanner scanner = new Scanner(System.in);
//     Scanner - name of class
//        scanner - name of object
        System.out.println("Enter your name:");
       String name = scanner.nextLine();
//       nextline = reads a string of characters including any spaces
//        next = does not read any spaces
        System.out.println("Hello " + name);
//        To read an integer
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you are "+ age + " years old");
        System.out.println("What is your current GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Hello " + name + " your GPA is " + gpa);
        System.out.println("Are you a student?(true/false)");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello " + name + " it's " + isStudent + " She is a student" );
        if(isStudent){
            System.out.println("She is a student");
        } else{
            System.out.println("Not a student");
        }

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter Width:");
        width = scanner.nextDouble();
        System.out.println("Enter Height:");
        height = scanner.nextDouble();

       area = height*width;
        System.out.println("The area of the rectangle is " + area);
     scanner.close();
//     Closing the object to ensure that we do not have unexpected behaviour eg when reading/opening a file we will need to close it


    }
}