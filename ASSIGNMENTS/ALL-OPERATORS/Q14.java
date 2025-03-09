class Q14
{
  public static void main(String args[])
   {
      setBits(11);
      setBits(5); 
   }
  
 public static void setBits(int num)
    {
      int count = 0;
		while(num > 0){
            num = (num & (num - 1));
            count++;
        }
		System.out.println(count);
  }
}