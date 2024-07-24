package loop1;

public class Test7 {
public static void main(String[] args) {
	
	int number=456827 ,i=0;
	do {
		number=number/10;
		i++;
	}while(number!=0);
	System.out.println(i);
}
}
