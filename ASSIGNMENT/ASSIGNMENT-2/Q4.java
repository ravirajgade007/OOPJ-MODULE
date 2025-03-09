import java.util.Scanner;

 class Q4 
{
    public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 2) {
            num = num >> 3;
           //Or  num = num - 3;
        }

        if (num == 0) {
            System.out.println("The number is divisible by 3.");
        } else {
            System.out.println("The number is NOT divisible by 3.");
        }
    }
}
