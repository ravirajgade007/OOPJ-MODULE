import java.util.Scanner;
class Q2
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
   
     System.out.print("Enter Number:");
     int n = sc.nextInt();

   if((n & 1) == 0)
    {
      System.out.println(n + " is Even");
   }
   else
       {
         System.out.println(n+" is odd");
        }

  }
}