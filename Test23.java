package loop1;

public class Test23 {
public static void main(String[] args) {
	long i=2;
	long count =0;
	while(i<=10000000) {
		count=i;
		i=count*count;
		
		System.out.println(count);
	}
}
}
