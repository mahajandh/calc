package subtraction;
import java.util.Scanner;
    
public class Subtraction {
  
public static void main(String[] args) {
 
 // TODO Auto-Generated meathod stub 
 
 Scanner input = new Scanner(System.in);
 
 int firstNumber=0, secondNumber=0;
 
 int Subtraction;

System.out.println("ENTER FIRST NUMBER:");

firstNumber = input.nextInt();

System.out.println("ENTER SECOND NUMBER:");

secondNumber = input.nextInt();

Subtraction = firstNumber - secondNumber;

System.out.println("Subtraction of the two numbers is " + Subtraction);

}
}