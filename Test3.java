package loop1;

public class Test3 {
public static void main(String[] args) {
	int number=43704000, count=0;
	
	while(number!=0)
	{
		number=number/10;
		count++;
	}
	
	System.out.println(count);
}
}
