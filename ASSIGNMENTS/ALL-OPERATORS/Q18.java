public class Q18{
	public static void main(String args[]){
		result(50);
		result(39);
	}
	
	public static void result(int marks){
		String result = (marks>=40)? "Pass" : "Fail";
		System.out.println("Result:" + result);
	}
}