package lab1;

public class taskThree 
{
	public static void main(String[] args) {
		int d = 0b11000;
		int m = d(d);
		System.out.println(m);
	}
	static int d(long n) {
	        int count = 0;

	        for (; n > 0; count++) {
	            n &= n - 1;
	            
	            }
	         return count;
	}
}

	        
	   
	
	
	

	


		
	


