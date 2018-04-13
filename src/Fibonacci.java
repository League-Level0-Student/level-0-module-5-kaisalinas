
public class Fibonacci {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	int first = 0;
	int second = 1;
	int third = first + second;
	
	for(int  i=0; i<12; i++) {
		System.out.println(third);
		first=second;
		second=third;
		third=first+second;
				
	}
}

}
