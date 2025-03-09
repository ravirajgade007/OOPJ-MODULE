class Q16
{
    public static void numbers(int num)
    {
        String result = (num == 0) ? "Zero" : (num > 0) ? "Positive" : "Negative"; 
        System.out.println("Result of " + num + ": " + result);
    }
  
   public static void main(String args[])
   {
      numbers(4);
      numbers(-8);
      numbers(0);
      
  }
}