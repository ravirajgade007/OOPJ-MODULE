import java.util.Scanner;

class Q7
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter Year:");
     int year = sc.nextInt();

    if((year%4 ==0 && year%100 !=0) || year %400 == 0)
     {
         System.out.print(year + " is Leap Year.");
     }
    else
       {
        System.out.print(year + " is not Leap Year.");
       }
  
   }
}