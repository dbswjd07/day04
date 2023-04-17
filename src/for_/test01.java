package for_;

import java.util.Scanner;

public class test01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num =0, num2=0;
	System.out.println("===== 구구단 =====");
	
	System.out.print("단수 입력: ");
	num = input.nextInt();
	
	for(int i=num;i<=num;i++) {
		for(int j=1;j<=9;j++) {
			num2 = i*j;
			System.out.println(i+"*"+j+"="+num2);
		}
	}
	
}
}
