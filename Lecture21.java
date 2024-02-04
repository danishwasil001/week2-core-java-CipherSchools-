// Scanner Class 
// how to take input from the user in different data types
import java.util.Scanner;
class Scclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");

        String fname=sc.next();
        String lname=sc.next();
        System.out.print("Please enter your profession:");
        String prof=sc.next();
        System.out.print("Please enter your Country:");
        sc.nextLine();
        String country=sc.nextLine();
        System.out.print("Please enter your Housenumber:");
        int h=sc.nextInt();
        int x=sc.nextInt();
         sc.nextLine();
        System.out.print("Please enter your village:");
        String village=sc.nextLine();
        System.out.println("First name is: "+fname); 
        System.out.println("Last name is: "+lname);
        System.out.println("Profession is: "+prof);
        System.out.println("Country is: "+country);
        System.out.println("House number is: "+h);
        System.out.println("Village is:"+village+" "+ x);
    }
}
