import java.util.Scanner;

class Q8
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
   
     System.out.print("Enter 1st value (true/ false): ");
     boolean val1 = sc.nextBoolean();

     System.out.print("Enter 2nd value (true/ false): ");
     boolean val2 = sc.nextBoolean();

     System.out.print("Enter 3rd value (true/ false): ");
     boolean val3 = sc.nextBoolean();

    boolean result  = (val1 && val2) || (val2 && val3) ||(val1 && val3);

     System.out.println("At least two of them are true: " + result);
   
  }
}