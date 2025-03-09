class Q11
{
   public static void checkNum(int num)
    {
      if(num < 0) 
       {
          num = -num;
     }
    if((num & (num-1)) == 0)
    {
       System.out.println(num + " is a power of 2.");
    }
  else
   {
       System.out.println(num + " is not a power of 2.");
 }
   }
   public static void main(String args[])
   {
       checkNum(4);
       checkNum(10);
  }
}