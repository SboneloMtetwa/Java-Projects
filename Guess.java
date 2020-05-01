import java.util.Scanner;

  public class Guess {

   public static void main(String[] args) { 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if( number < 100)
    { System.out.println("Number is Incorrect"); }
    else if (number == 100)
    { System.out.println("Number is Correc"); }
    else 
    { System.out.println("Number is Incorrect"); }


  }
 }