public class Q19{
	public static void main(String args[]){
		character('r');
		character('R');
		character('1');
	}
	
	public static void character(char c){
		int i = (int) c;
		String result = (c>65 && c<92)? "Uppercase" : (c>97 && c<124)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}