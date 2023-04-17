package for_;

public class Ex02 {
public static void main(String[] args) {
	int evenSum = 0, oddSum = 0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println("짝수일때: "+i);
			evenSum += i;
		}else {
			System.out.println("홀수일때: "+i);
			oddSum += i;
		}
		System.out.println("for 끝");
	}
	System.out.println("1~10 짝수 합: "+evenSum);
	System.out.println("1~10 홀수 합: "+oddSum);
	
	
	
}
}
