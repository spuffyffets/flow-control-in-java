package loop;

public class test10 {

	public static void main(String[] args) {
		int i;
		int evenCount=0;
		int oddCount=0;
		for( i=2;i<=50;i++) {
			if(i % 2 == 0) {
				evenCount++;
				
			}	
			else if(i % 2 != 0)
			{
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
