public class Q15
  {
    public static void main(String[] args)
       {
		swap(10);
		swap(8);
	}
	
	public static void swap(int x){ 
	    int evenBits = (x & 0xAAAAAAAA) >> 1; 
        int oddBits = (x & 0x55555555) << 1;   
        int res = (evenBits | oddBits);   
	System.out.println(res);
	} 
}	
