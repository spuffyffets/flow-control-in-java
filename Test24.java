package loop1;

public class Test24 {
	public static void main(String[] args) {
		long i=2;
		long count =0;
		do {
			count=i;
			i=count*count;
			
			System.out.println(count);
		}while(i<=10000000);
	}

}
