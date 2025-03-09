public class Q23
{
	public static void main(String[] args)
{
		int num1 = 19;
                int num2 = 10;
		evenOdd(num1);
                evenOdd(num2);               
	}
	
	public static void evenOdd(int num){
		if((num & 1) == 0){
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
}	