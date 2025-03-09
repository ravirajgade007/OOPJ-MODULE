import java.util.Scanner;
 class Q22
 {
    public static void main(String[] args)
      {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
 
		System.out.println("MENU: ");
		System.out.println("1. ADDITION ");
		System.out.println("2. SUBTRACTION ");
		System.out.println("3. MULTIPLICATION ");
		System.out.println("4. DIVISION ");
		System.out.println("5. FIND REMAINDER ");
		System.out.print("Enter your Option: ");		
		int choice = sc.nextInt();
		while(choice!=6){
			switch(choice){
				case 1: System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
						break;
				case 2: System.out.println("Difference between " + num1 + " - " + num2 + " = " + (num1 - num2));
						break;
				case 3: System.out.println("Multiplication of " + num1 + " x " + num2 + " = " + (num1 * num2));
						break;
				case 4: System.out.println("Quotient in division of " + num1 + " / " + num2 + " = " + ((float)num1 / (float)num2));
						break;
				case 5: System.out.println("Remainder in division of " + num1 + " and " + num2 + " = " + ((float)num1 % (float)num2));
						break;
				default:System.out.println("INVALID OPTION");
						break;
			}
			System.out.print("Enter your Option: ");
			choice = sc.nextInt();
		}
		System.out.println("EXITING PROGRAMMING!");
	}
}