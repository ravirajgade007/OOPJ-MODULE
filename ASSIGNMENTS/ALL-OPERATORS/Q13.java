class Q13
{
   public static void absoluteVal(int num)
     {
       int mask = num >> 31;
       int abs = (num + mask) ^ mask;
     System.out.println("Absolute Value:" + abs);
    }

   public static void main(String args[])
   {
      absoluteVal(10);
      absoluteVal(-5);      
  
  
  }
}