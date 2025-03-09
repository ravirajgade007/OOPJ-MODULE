class Q17
{     
    public static void minimum(int num1, int num2, int num3,int num4)
    {
       int minNum = (num1 < num2 && num1 < num3 && num1 < num4) ? num1:(num3< num2 && num3 < num1 && num3 < num4)? num4:(num2 < num3  && num2 < num1 && num2 < num4)? num2 : num4;
      System.out.println("Minimum number is:" + minNum);
    }
    
   public static void main(String args[])
   {
       minimum(10,20,40,50);
  }
}