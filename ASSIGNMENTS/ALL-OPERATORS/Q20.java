public class Q20{
	public static void main(String args[]){
		absoluteVal(40);
		absoluteVal(-122);
	}
	
	public static void absoluteVal(int num){
		int result = (num>0)? num : -num;
		System.out.println("absolute value: " + result);
	}
}