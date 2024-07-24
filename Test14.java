package loop1;

public class Test14 {
public static void main(String[] args) {
	int i=1;
	int count=0;
	do {
		if(i%4==0) {
			count++;
		}i++;
	}while(i<=120);
	System.out.println(count);
}
}
