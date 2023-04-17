package switch_;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num = 0;
	String home_addr=null, com_addr=null;
	while (true) {
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		num = input.nextInt();
		
		switch(num) {
		case 1: 
			System.out.print("우리집 목적지 입력: ");
			home_addr = input.next();
			System.out.println("등록 성공");
			break;
			
		case 2: 
			System.out.print("회사 목적지 입력: ");
			com_addr = input.next(); 
			System.out.println("등록 성공");
			break;
			
		case 3: 
			System.out.println("우리집: "+ home_addr);
			System.out.println("회사: " + com_addr);
		}
	}
}
}
