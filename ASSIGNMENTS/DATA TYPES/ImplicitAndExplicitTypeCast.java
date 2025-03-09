class ImplicitAndExplicitTypeCast
{
  public static void main(String args[])
   {
     int i = 50000;
     long l = i;
     float f  = l;

     System.out.println("Implicit (Automatically) Type Casting");
     System.out.println("int to long: " + l);
     System.out.println("long to float: " + f);

    double d = 88.9999;
    int i1 = (int) d;
    char c = (char) i1;

     System.out.println("Explicit (Manually) Type Casting");
     System.out.println("double to int: " + i1);
     System.out.println("int to char: " + c);
     
     }
}