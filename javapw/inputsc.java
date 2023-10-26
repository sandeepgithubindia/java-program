import java.util.Scanner;
public class inputsc {
   public static void main(String[] args) {
    Scanner scan1=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=scan1.nextInt();
    System.out.println("Age is "+age);
    System.out.println("Enter the Average");
    double avg= scan1.nextDouble();
    System.out.println("Avg is"+avg);
    System.out.println("Enter name :");
    String name= scan1.nextLine();
    System.out.println("Name is "+name);
    scan1.close();
   } 
}
