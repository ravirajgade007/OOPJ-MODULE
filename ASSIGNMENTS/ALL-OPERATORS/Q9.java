import java.util.Scanner;
class Q9
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
  
     System.out.print("Enter Number:");
     int num = sc.nextInt();

     boolean range  = (num >=20 && num<=50);

 System.out.println("Number " + num + (range ? " is within the range." : " is outside the range."));
  }
}