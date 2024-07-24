package loop1;

public class Test26 {
public static void main(String[] args) {
	int i=1;
	int b=9;
	do {
		if(b%i==0) {
			System.out.println(i);
		}i++;
	}while(i<=b);
}
}
