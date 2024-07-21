package loop;

public class test7 {

	public static void main(String[] args) {
		int count =0;
		int i;
		for( i=1;i<=120;i++) {
			if(i % 4 == 0) {
				count++;
			}
		}
		System.out.println( count);
	}
}
