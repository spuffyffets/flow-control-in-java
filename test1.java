package loop1;

public class test1 {

	public static void main(String[] args) {
		System.out.println("START");
		for (int i = 1; i<= 10; i++) {
			if (i%2!=0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
		System.out.println("STOP");
	}
}
