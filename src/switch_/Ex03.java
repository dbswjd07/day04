package switch_;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//	String name = null;
//	while(true) 
//	{
//		System.out.println("이름 입력");
//		name = input.next();
//		System.out.println("당신 이름: "+name);
//	}
	
	int day = 0;
	while(true) {
		System.out.print("날짜 입력: ");
		day = input.nextInt();
		
		switch(day%7) {
		case 0: System.out.println(day+ "일 일요일");break;
		case 1: System.out.println(day+ "일 월요일");break;
		case 2: System.out.println(day+ "일 화요일");break;
		case 3: System.out.println(day+ "일 수요일");break;
		case 4: System.out.println(day+ "일 목요일");break;
        case 5: System.out.println(day+ "일 금요일");break;
		case 6: System.out.println(day+ "일 토요일");break;
		}
	
	}
	
	
}
}
