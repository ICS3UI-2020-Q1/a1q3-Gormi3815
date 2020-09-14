import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println ("How many chromebook chargers would you like");
    int Chromebook_chargers =input.nextInt();
    double Chromebook_chargerstotal  =Chromebook_chargers  * 34.99;
    System.out.println("How many motherboards would you like");
    int Motherboard =input.nextInt();
    double Motherboardtotal =Motherboard * 127.50;
    System.out.println("How many mice would you like");
    int Mice =input.nextInt();
    int Micetotal =Mice*18;
    double Subtotal = Chromebook_chargerstotal+Motherboardtotal+Micetotal;
    System.out.println("Your Subtotal is " + Subtotal + "." );
double taxes = Subtotal*0.13;
System.out.println("Tax is " + taxes + ".");
    double total = Subtotal+taxes;
    System.out.println("Your total is " + total + ".");
  }
}
