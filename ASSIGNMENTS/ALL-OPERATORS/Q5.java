import java.util.Scanner;
class Q5
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);

     System.out.print("Enter 1st Number:");
     int num1 = sc.nextInt();

     System.out.print("Enter 2nd Number:");
     int num2 = sc.nextInt();
  
     System.out.println("Before Swapping:" + num1 + " " + num2);
     num1 += num2;
     num2 = num1 - num2;
     num1 -= num2;
    
     System.out.print("After Swapping:" + num1 + " "  + num2);

   }
}