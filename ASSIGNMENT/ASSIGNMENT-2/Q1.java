class Q1
  {
     public static void main(String args[])
     {
        int num1 = 10;
        int num2 = 20;

   System.out.print("Before: " + num1 + " & " + num2);
   
        num1 = num1 ^ num2;
        num2  = num1 ^ num2;
        num1 = num1 ^ num2;
 
     System.out.println();
     System.out.print("After: " + num1 + " & " + num2);
   }
   
  }