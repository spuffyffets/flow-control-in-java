package loop1;

public class Test19 {
public static void main(String[] args) {
	int i=2;
	int evencount=0;
	int oddcount =0;
	while(i<=50) {
		if(i%2==0) {evencount++;
		}else if(i%2!=0) {oddcount++;}
		i++;
	}System.out.println("Even no = "+evencount);
	System.out.println("Odd no = "+oddcount);
}
}
