import java.util.Scanner;
class Q6
{
  public static void main(String args[])
  {
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter alphabet:");
        char c = sc.next().charAt(0);
  
       if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
          {
              System.out.println(c + " is a Vowel.");
           }
        else
            System.out.println(c + " is a consonant.");
  }
}