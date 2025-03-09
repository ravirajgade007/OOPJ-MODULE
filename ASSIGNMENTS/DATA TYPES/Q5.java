class Q5
{
  public static void main(String args[])
  {
     int num1 = 10;
     int num2 = 20;
     int num3 = 30;
     int num4 = 40;
     
  System.out.println("Before Swapping numbers without temp variable: " + num1 + " & " + num2);
  
     num1 = num1 + num2;
     num2 = num1 - num2;
     num1 = num1 - num2;
    
    System.out.println("After Swapping numbers without temp variable: " + num1 + " & " + num2); 
    System.out.println();
   
    System.out.println("Before Swapping numbers with temp variable: " + num3 + " & " + num4);

    int temp = num3;
        num3 = num4;
        num4 = temp;

    System.out.println("After Swapping numbers with temp variable: " + num3 + " & " + num4); 



  }
}