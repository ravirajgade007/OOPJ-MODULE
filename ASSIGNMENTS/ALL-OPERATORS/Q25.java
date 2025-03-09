class Q25
{
   static public void main(String me[])
      {
 	int num = 4878;
        int rev = 0;
	int temp = num;
	while(num!=0)
          {
	    rev = rev * 10 + num % 10;
	    num = num/10;
	   }
	      System.out.println("Reverse of " + temp + " is " + rev);
	}
}