import java.util.Scanner;

class Q10 {
    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter character:");
        char ch = sc.next().charAt(0);
 
        ch = Character.toLowerCase(ch);

        String result = "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        System.out.println(ch + " is a " + result);
    }
}